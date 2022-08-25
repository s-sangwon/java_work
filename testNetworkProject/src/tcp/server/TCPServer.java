package tcp.server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	public TCPServer() {}
	
	
	public void start() {
		//1. 포트번호 지정
		int port = 5000;
		try {
			//2. 서버용 소켓 객체 생성
			ServerSocket server = new ServerSocket(port);
			
			//3. 클라이언트가 연결을 요청할 때까지 기다림
			while(true) {
				System.out.println("서버 대기중...");
				
				//4. 클라이언트로 부터 연결 요청이 오면 수락함
				// 연결 요청한 클라이언트 정보를 저장함
				// 해당 클라이언트에 대한 소켓 객체 만듦
				Socket client = server.accept();
				System.out.println("서버와 클라이언트 연결됨...");
				
				//5. 클라이언트와 서버간의 입출력 스트림 생성함
				//네트워크 입출력은 바이트 스트림만 가능함
				InputStream input = client.getInputStream();
				OutputStream output = client.getOutputStream();
				
				//사용의 편의를 이ㅜ해 추가로 보조스트림을 연결할 수도 있음
				//바이트스트림을 문자스트림으로 변경해서 사용할 수도 있음
				//버퍼 이용 스트림을 추가할 수도 있음
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);
				
				//6. 데이터 주고 받음 : 순서가 중요함
				//클라이언트가 메세지 보냄 >> 서버가 받아서 출력
				// >> 서버가 답을 보냄 >> 클라이언트가 받아서 출력
//				String message = br.readLine();
//				System.out.println(client.getInetAddress()
//						+ " 보낸 메세지 : " + message);
//				//서버가 답을 보냄
//				Scanner sc = new Scanner(System.in);
//				System.out.print("응답 메세지 : ");
//				pw.print(sc.nextLine());
//				pw.flush();
				// 반복해서 주고 받기
				Scanner sc = new Scanner(System.in);
				//클라이언트가 "quit" 를 보내면 종료
				while(true) {
					String message = br.readLine();
					if(message.equals("quit"))
						break;
					System.out.println(client.getInetAddress()+ " 보낸 메세지 : " + message);
				
					System.out.print("응답 메세지 : ");
					pw.println(sc.nextLine());
					pw.flush();
				}
				
				//7. 스트림 반납, 클라이언트 소켓 닫음
				//나중에 생성한 스트림부터 닫는다.
				pw.close();
				br.close();
				output.close();
				input.close();
				
				client.close();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
