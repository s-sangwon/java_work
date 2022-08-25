package test.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ip 주소 : 커뮤터마다 부여된 네크워크상에서의 식별번호
		
		// 내 컴퓨터(localhost) 의 주소 조회
		
		try {
			InetAddress ip1 = InetAddress.getLocalHost();
			System.out.println(ip1.getHostAddress());
			System.out.println(ip1.getHostName());
			
			//host 이름(도메인명도 해당됨)을 가지고 ip주소 조히ㅗ
			InetAddress naverIP= InetAddress.getByName("www.naver.com");
			InetAddress[] googleIP= InetAddress.getAllByName("www.google.com");
			
			System.out.println("naver : " + naverIP.getHostAddress());
			System.out.println("google 서버 ip 갯수 : " + googleIP.length);
			
			for(InetAddress ip : googleIP)
				System.out.println(ip.getHostAddress());
			
			//naver 서버의 ip 주소들 전부 조회한다면
			InetAddress[] naverIP2 = InetAddress.getAllByName("www.naver.com");
			System.out.println("naver 서버 ip 갯수 : " + naverIP2.length);
			for(InetAddress ip : naverIP2)
				System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
