package test.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//버퍼를 이용하는 보조(추가)스트림을 추가 연결해서 성능을 보완한 클래스
public class BufferedFileIOSample {
	private Scanner sc = new Scanner(System.in);

	public BufferedFileIOSample() {
	}

	// 바이트 스트림 이용한 파일 출력(파일에 저장) 처리용
	public void byteFileOutput() {
		// 키보드로 값을 입력받아서 파일에 기록 저장 처리
		String value = null;

		System.out.print("내용을 저장할 파일명 : ");
		String fileName = sc.next();

		// FileOutputStream fout = null;

		// try with resource 문 사용 : 자동 close 됨 => finally 필요없음
		// try (클래스명 레퍼런스 = new 생성자(); 클래스명 레퍼런스 = new 생성자();){}
		try (FileOutputStream fout = 
				new FileOutputStream(fileName);
			BufferedOutputStream bout = 
					new BufferedOutputStream(fout);) {
			// fout = new FileOutputStream(fileName);
			// 대상 파일이 없으면 자동으로 파일을 새로 만듦
			// 대상 파일이 있으면 덮어쓰기됨 (overwriting)

			System.out.println(fileName + " 에 저장할 내용을 입력하세요.[종료 : exit 입력]");
			while (!(value = sc.nextLine()).equals("exit")) {
				//fout.write(value.getBytes()); // String -> byte[]
				bout.write(value.getBytes());
			}

			System.out.println(fileName + "저장 완료!");

		} catch (IOException e) {
			e.printStackTrace();
		}
//				finally {
//				try {
//					fout.close(); //스트림 반납
//				} catch (IOException e) {				
//					e.printStackTrace();
//				}  
//			}

	}

	// 바이트 스트림 이용한 파일 입력(파일 열기) 처리용
	public void byteFileInput() {
		// 파일의 내용을 읽어들여서 콘솔에 출력
		// FileInputStream fin = null;

		System.out.print("읽을 파일명 : ");
		String fileName = sc.next();

		//try (FileInputStream fin = new FileInputStream(fileName);) {
		try(BufferedInputStream bin = 
				new BufferedInputStream(
						new FileInputStream(fileName));){
			// fin = new FileInputStream(fileName);
			// 파일 읽을때는 대상 파일이 없으면 에러임.

			// 방법 1. 값을 하나씩 읽어와서 바로 출력
//				int data;
//				while((data = fin.read()) != -1) {
//					System.out.print((char)data);
//				}

			// 방법 2. byte[] 에 읽은 값을 저장하고 한번에 출력
			byte[] bar = new byte[(int) (new File(fileName).length())];
			//fin.read(bar); // 파일의 내용을 읽어서, 배열에 저장함
			bin.read(bar);
			// 출력을 위해 byte[] --> String 으로 바꿈
			System.out.println(new String(bar));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//			finally {
//				try {
//					fin.close();
//				} catch (IOException e) {				
//					e.printStackTrace();
//				}
//			}

	}

	// 문자 스트림 이용한 파일 출력 처리용
	public void charFileOutput() {
		// 키보드로 문자열 입력받아서, 텍스트 파일에 저장 처리
		String value = null;

		System.out.print("저장할 파일명 : ");
		String fileName = sc.next();

		try (FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);) {
			// 대상 파일이 없으면, 파일을 새로 만듦
			// 대상 파일이 있으면, 새로쓰기 상태로 열림 (기존 내용은 삭제됨)

			System.out.println(fileName + "에 기록할 내용을 입력하세요.[종료는 exit 입력]");
			while (!(value = sc.nextLine()).equals("exit")) {
				//fw.write(value + "\n");
				bw.write(value + "\n");
			}

			System.out.println(fileName + "저장 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 문자 스트림 이용한 파일 입력 처리용
	public void charFileInput() {
		// 텍스트 파일의 내용을 읽어서 콘솔에 출력
		System.out.print("읽을 파일명 : ");
		String fileName = sc.next();

		//try (FileReader fr = new FileReader(fileName);) {
		try (BufferedReader br = new BufferedReader(
				new FileReader(fileName));){
			// 파일 읽을 때는 대상 파일이 없으면 에러 발생함
			// 자동 close 되므로 IOException 예외 처리 필요함

			// 방법 1. 문자 하나씩 읽어와서 바로 출력
//				int data;
//				while((data = fr.read()) != -1) {
//					System.out.print((char)data);
//				}

			// 방법 2. char[] 에 읽은 값 저장하고 한번에 출력
			char[] car = new char[(int) (new File(fileName).length())];
			//fr.read(car);
			br.read(car);
			
			// 출력하려면 char[] --> String 으로 바꿈
			// System.out.println(new String(car));
			System.out.println(String.valueOf(car));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
