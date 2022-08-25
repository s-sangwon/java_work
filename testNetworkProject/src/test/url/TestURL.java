package test.url;

import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {

	public static void main(String[] args) {
		// java.net.URL class test
		try {
			URL url = new URL("https://developer.mozilla.org/ko/docs/Glossary/URL");
		
			System.out.println("프로토콜 : "+ url.getProtocol());
			System.out.println("포트번호 : "+ url.getPort());
			System.out.println("호스트명 : "+ url.getHost());
			System.out.println("파일경로 : "+ url.getFile());
			System.out.println("전체경로 : "+ url.toExternalForm());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
