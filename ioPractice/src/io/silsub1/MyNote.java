package io.silsub1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyNote {
	private Scanner sc = new Scanner(System.in);

	public MyNote() {
	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		String value = null;

		System.out.print("파일에 저장할 내용을 입력하시오[종료 : exit입력] :");
		while (!(value = sc.nextLine()).equals("exit")) {
			sb.append(value + "\n");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.print("저장하시겠습니까? (y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		if (ch == 'Y') {
			System.out.print("내용을 저장할 파일명 : ");
			String fileName = sc.next();
			try //(FileWriter fw = new FileWriter(fileName); BufferedWriter bw = new BufferedWriter(fw);) {
				(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
				// 대상 파일이 없으면, 파일을 새로 만듦
				// 대상 파일이 있으면, 새로쓰기 상태로 열림 (기존 내용은 삭제됨)
				bw.write(sb.toString());

				System.out.println(fileName + "저장 완료!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void fileOpen() {
		System.out.print("열기할 파일명 : ");
		String fileName = sc.next();

		// try (FileReader fr = new FileReader(fileName);) {
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
			// 파일 읽을 때는 대상 파일이 없으면 에러 발생함
			// 자동 close 되므로 IOException 예외 처리 필요함

			// 한줄씩 읽어와 출력
			String s;
			while ((s = br.readLine()) != null)
				System.out.println(s);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	public void fileEdit() {
		System.out.print("수정할 파일명 : ");
		String fileName = sc.next();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));) {

			// 파일 읽을 때는 대상 파일이 없으면 에러 발생함
			// 자동 close 되므로 IOException 예외 처리 필요함
			
			
			
			
			
			StringBuilder sb = new StringBuilder();
			String value = null;

			System.out.print("파일에 추가할 내용을 입력하시오[종료 : exit입력] :");
			while (!(value = sc.nextLine()).equals("exit")) {
				sb.append(value + "\n");
			}
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			if (sc.next().toUpperCase().charAt(0) == 'Y') {
				sb.deleteCharAt(sb.length() - 1);
				bw.write(sb.toString());
				System.out.println(fileName + " 파일의 내용이 변경되었습니다.");
			}
			sb = null;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}
