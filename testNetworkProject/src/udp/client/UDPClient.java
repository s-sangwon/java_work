package udp.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient {
	public UDPClient() {}
	
	public void receiveMessage() {
		//1. 서버가 보낸 메세지 받을 byte[] 준비
		byte[] reciveData = new byte[1024];
		
		try {
			//2. 데이터그램소켓과 데이터그램 패킷 객체 준비
			DatagramSocket client = new DatagramSocket(6000);
			DatagramPacket packet = new DatagramPacket(reciveData, 1024);
			
			//3. 서버측에서 보낸 데이터 받기
			client.receive(packet);
			
			//4. 받은 데이터 출력 확인 : byte[] --> String
			System.out.println("확인 : " + new String(reciveData));
		
			client.close();
		} 
		catch (SocketException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UDPClient().receiveMessage();
	}

}
