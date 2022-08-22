package board.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import board.model.vo.AscBoardDate;
import board.model.vo.AscBoardNo;
import board.model.vo.AscBoardTitle;
import board.model.vo.Board;
import board.model.vo.DescBoardDate;
import board.model.vo.DescBoardNo;
import board.model.vo.DescBoardTitle;

public class BoardManager {

	private ArrayList<Board> list = new ArrayList<Board>();
	private Scanner sc = new Scanner(System.in);

	public BoardManager() {
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("board_list.dat"))) {

			while (true) {
				list.add((Board) objIn.readObject());
			}

		} catch (EOFException e) {
			System.out.println("읽어오기 끝");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void writeBoard() {
		sc.reset();
		System.out.println("새 게시글 쓰기 입니다.");
		System.out.print("글제목 : ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String writer = sc.next();
		Date date = new Date();
		System.out.print("글내용(종료 exit) : ");
		String content = "", str;
		sc.nextLine();
		while (!(str = sc.nextLine()).equals("exit")) {
			content += str + "\n";
		}
		list.add(new Board(list.size(), title, writer, date, content, 0));
	}

	public void displayAllList() {
		for (Board b : list) {
			System.out.println(b);
		}
	}

	public void displayBoard() {
		System.out.print("조회할 글번호 : ");
		int no = sc.nextInt();
		Board b = list.get(no);
		System.out.println(b);
		b.setReadCount(b.getReadCount() + 1);
	}

	public void modifyTitle() {
		System.out.print("수정할 글번호 : ");
		int no = sc.nextInt();
		Board b = list.get(no);
		System.out.println(b);
		sc.nextLine();
		System.out.print("변경할 제목 : ");
		// String title = sc.nextLine();
		b.setBoardTitle(sc.nextLine());
		System.out.println(b);
		// list.set(no, b); //안해도 될껄?

	}

	public void modifyContent() {
		System.out.print("수정할 글번호 : ");
		int no = sc.nextInt();
		Board b = list.get(no);
		System.out.println(b);
		
		System.out.print("변경할 내용(종료 exit) : ");
		String content = "", str;
		sc.nextLine();
		while (!(str = sc.nextLine()).equals("exit")) {
			content += str + "\n";
		}
		b.setBoardContent(content);
		System.out.println("글내용 수정 완료.");
		// list.set(no, b); //안해도 될껄?
	}
	
	public void deleteBoard(){
		System.out.print("삭제할 글번호 : ");
		int no = sc.nextInt();
		Board b = list.get(no);
		System.out.println(b);
		
		System.out.print("정말로 삭제하시겠습니까? (y/n) : ");
		if( sc.next().toUpperCase().charAt(0) == 'Y') {
			list.remove(no);
			System.out.println(no + "번 글이 삭제되었습니다.");
		}
		
		
	}
	
	public void searchBoard(){
		System.out.print("검색할 제목 : ");
		String  title = sc.next();
		for(Board b : list) {
			if(b.getBoardTitle().contains(title))
				System.out.println(b);
		}
	}
	
	public void saveListFile(){
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {
			for(int i=0; i<list.size(); i++)
				objOut.writeObject(list.get(i));
			System.out.println("board_list.dat 에 성공적으로 저장되었습니다.");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 public void sortList(int item, boolean isDesc){
		 
		 switch (item) {
		 case 1: 
			 if(isDesc)
				 list.sort(new DescBoardNo());
			 else
				 list.sort(new AscBoardNo());
			 break;
		 case 2: 
			 if(isDesc)
				 list.sort(new DescBoardDate());
			 else
				 list.sort(new AscBoardDate());
			 break;
		 case 3: 
			 if(isDesc)
				 list.sort(new DescBoardTitle());
			 else
				 list.sort(new AscBoardTitle());
			 break;
		 }
		 
		 displayAllList();
	 }
}
