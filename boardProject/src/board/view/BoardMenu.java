package board.view;

import java.util.Scanner;

import board.controller.BoardManager;

public class BoardMenu {
	private Scanner sc = new Scanner(System.in);
	
	public BoardMenu() {}
	
	public void mainMenu() {
		String menu = 	"\n******* 게시글 서비스 프로그램 *******\n\n"+

				"1. 게시글 쓰기\n"+		//BoardManager의 writeBoard() 실행
				"2. 게시글 전체 보기\n"	+	//		displayAllList()
				"3. 게시글 한개 보기\n"	+	//		displayBoard()
				"4. 게시글 제목 수정\n"	+	//		modifyTitle()
				"5. 게시글 내용 수정\n"+		//		modifyContent()
				"6. 게시글 삭제\n"	+	//		deleteBoard()
				"7. 게시글 검색\n"	+	//		searchBoard()
				"8. 파일에 저장하기\n"+		//		saveListFile()
				"9. 정렬하기\n"	+	// BookMenu 의 sortSubMenu() 실행
				"0. 끝내기\n\n"	+	//main() 으로 리턴함

				"메뉴 번호 선택 : ";
		BoardManager bm = new BoardManager(); 
		do {
			System.out.print(menu);
			int no = sc.nextInt();
			switch(no) {
			case 1: bm.writeBoard();	break;
			case 2: bm.displayAllList();	break;
			case 3: bm.displayBoard();	break;
			case 4: bm.modifyTitle();	break;
			case 5: bm.modifyContent();	break;
			case 6: bm.deleteBoard();	break;
			case 7: bm.searchBoard();	break;
			case 8: bm.saveListFile();	break;
			case 9: sortSubMenu();	break;
			case 0: return;
			default: 	break;
			}
			
			
		} while(true);
	}
	
	public void sortSubMenu(){
		BoardManager bm = new BoardManager(); 
		
		String menu = "\n****** 게시글 정렬 메뉴 ******\n\n"+

				"1. 글번호순 오름차순정렬\n"+//BookManager 의 	sortList(1, false) 실행
				"2. 글번호순 내림차순정렬\n"+//		sortList(1, true) 실행
				"3. 작성날짜순 오름차순정렬\n"+	//		sortList(2, false) 실행		
				"4. 작성날짜순 내림차순정렬\n"+	//		sortList(2, true) 실행
				"5. 글제목순 오름차순정렬\n"	+//		sortList(3, false) 실행
				"6. 글제목순 내림차순정렬\n"	+//		sortList(3, true) 실행
				"7. 이전 메뉴로 이동\n\n"	+	//return 처리

				"메뉴 번호 : ";
		do {
			System.out.print(menu);
			int no = sc.nextInt();
			switch(no) {
			case 1:	bm.sortList(1, false);	break;
			case 2:	bm.sortList(1, true);	break;
			case 3:	bm.sortList(2, false);	break;
			case 4:	bm.sortList(2, true);	break;
			case 5:	bm.sortList(3, false);	break;
			case 6:	bm.sortList(3, true);	break;
			case 7:		return;
			}
			
			
		}while(true);
		
	}
}
