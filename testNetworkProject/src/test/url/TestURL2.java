package test.url;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.util.Scanner;

public class TestURL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingURLtoInetAddress();
	}

	private static void usingURLtoInetAddress() {
		// 키보드로 URL을 입력(복사)받아서
		// 프로토콜, 포트번호, 호스트명, 파일경로, 쿼리스트링 분리 출력
		// IP주소 조회 출력 처리
		// URL은 한줄로 입력받고, 입력값에 공백을 없애고 처리함

		Scanner sc = new Scanner(System.in);
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			
			String s;
			while( true) {
			System.out.print("URL 입력(종료 none) : ");
			s = br.readLine().replace(" ", "");
			if(s.equals("none"))	
				break;
			System.out.println(s);
			URL url = new URL(s);
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트번호 : " + url.getPort());
			System.out.println("호스트명 : " + url.getHost());
			System.out.println("파일경로 : " + url.getFile());
			System.out.println("쿼리스트링 : " + url.getQuery());
			//InetAddress[] nets = InetAddress.getAllByName(url.getHost());
			
			System.out.println("IP주소 갯수 : " + InetAddress.getAllByName(url.getHost()).length);
			
			for(InetAddress ip : InetAddress.getAllByName(url.getHost()))
				System.out.println("IP주소 : " + ip.getHostAddress());
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
