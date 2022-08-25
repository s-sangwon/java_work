package test.inet;

import java.net.InetAddress;
import java.util.Scanner;

public class TestInetAddress2 {

	public static void main(String[] args) {
		// 키보드로 호스트명을 입력받아,
		// 해당 호스트의 ip 주소를 조회해서 출력 처리
		// 반복 실행 => "none"이 입력되면 반복 종료함
		displayHostIP();

	}

	private static void displayHostIP() {
		Scanner sc = new Scanner(System.in);

		try {
			while (true) {
				System.out.print("호스트명(종료 none) :");
				String hname = sc.next();
				if (hname.equals("none"))
					break;
				InetAddress[] nets = InetAddress.getAllByName(hname);

				System.out.println(hname + "서버 ip 갯수 : " + nets.length);
				for (InetAddress ip : nets) {
					System.out.println(ip.getHostAddress());
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
