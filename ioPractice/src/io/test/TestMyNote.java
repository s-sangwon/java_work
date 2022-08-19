package io.test;

import java.util.Scanner;

import io.silsub1.MyNote;

public class TestMyNote {

	public static void main(String[] args) {
		menu();
		System.out.println("main종료");
	}
	
	public static void menu() {
		MyNote note = new MyNote();
		Scanner sc = new Scanner(System.in);
		
		String menu = 	"\n******   MyNote  *******\n\n"+

				"1. 노트 새로 만들기\n"	+	//MyNote의 fileSave()
				"2. 노트 열기\n"	+		//MyNote의 fileOpen()
				"3. 노트 열어서 수정하기\n"+	//MyNote의 fileEdit()
				"4. 끝내기\n"+	//main() 으로 리턴

				"메뉴 선택 : ";
		do {
			System.out.print(menu);
			int no = sc.nextInt();
			switch (no) {
			case 1:	note.fileSave();	break;
			case 2:	note.fileOpen();	break;
			case 3:	note.fileEdit();	break;
			case 4:	return;
			default: System.out.println("다시입력하세요."); break;
			}
			
		}while(true);
		
	}
}
