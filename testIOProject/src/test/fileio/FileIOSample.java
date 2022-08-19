package test.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOSample {
	private Scanner sc = new Scanner(System.in);
	
	public FileIOSample() {}
	
	//바이트 스트림 이용한 파일 출력(파일에 저장) 처리용
	public void byteFileOutput() {
		//키보드로 값을 입력받아서 파일에 기록 저장 처리
		String value = null;
		
		System.out.print("내용을 저장할 파일명 : ");
		String fileName = sc.next();
		
		
		try (FileOutputStream fout = new FileOutputStream(fileName);){
			
			//대상 파일이 없으면 자동으로 파일을 새로 만듦
			sc.nextLine();
			System.out.print("저장할 내용 입력(종료 : exit 입력) :");
			while (!(value = sc.nextLine()).equals("exit")) {
				value = sc.nextLine() + "\n";
//				if(value.length()==1 || value.charAt(0) == '0')
//					break;
				fout.write(value.getBytes());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//바이트 스트림 이용한 파일 입력(파일 열기) 처리용
	public void byteFileinput() {
		System.out.println("읽을 파일명 : ");
		String fileName = sc.next();
		
		try (FileInputStream fin = new FileInputStream(fileName);){
			
			byte[] bar = new byte[(int)new File(fileName).length()];
			bar = fin.readAllBytes();
			for(int i=0; i<bar.length; i++)
				System.out.print((char)bar[i]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	//문자 스트림 이용한 파일 출력 처리용
	public void charFileOutput() {
		String value = null;
		
		System.out.print("저장할 파일명 : ");
		String fileName = sc.next();
		
		try (FileWriter fw = new FileWriter(fileName)) {
			
			System.out.println(fileName + "에 기록할 내용을 입력하세요.[종료는 eixt 입력] : ");
			while(!(value = sc.nextLine()).equals("exit")) {
				fw.write(value+"\n");
			}
			System.out.println(fileName + "저장 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//문사 스트림 이용한 파일 입력 처리용 
	public void charFileInput() {
		int value = 0;
		
		System.out.print("읽을 파일명 : ");
		String fileName = sc.next();
		
		try (FileReader fw = new FileReader(fileName)) {
			
//			while((value = fw.read()) != -1) {
//				System.out.print((char)value);
//			}
			
			char[] car = new char[(int)(new File(fileName).length())];
			fw.read(car);
			System.out.println(String.valueOf(car));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
