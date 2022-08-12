package member.view;

import java.util.Scanner;

import member.model.dao.MemberManager;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberManager mManager = new MemberManager();
	public MemberMenu() {
		super();
	}
	public void mainMenu(){

		
		do {
			String menu = 
					"최대 등록 가능한 회원 수는 "+MemberManager.SIZE+ " 명입니다.\n"+
					"현재 등록된 회원수는 "+ mManager.getMemberCount() +"명 입니다.\n"+
					
					"\n***** 회원 관리 프로그램 *****\n\n"+

					"1. 새 회원 등록\n"+
					"2. 회원 조회\n"+
					"3. 회원 정보 수정\n"+
					"4. 회원 정보 정렬\n"+
					"5. 회원 삭제\n"+
					"6. 모두 출력\n"+
					"9. 끝내기\n"+
					"메뉴 선택 : ";
			System.out.print(menu);
			int no = sc.nextInt();
			switch (no) {
			case 1:	mManager.memberInput(); break;
			case 2:	searchMenu(); break;
			case 3:	modifyMenu(); break;
			case 4:	sortMenu(); break;
			case 5:	mManager.deleteMember(); break;
			case 6:	mManager.printAllMember(); break;
			case 9:	
				System.out.print("정말로 끝내시곘습니까? (y/n) : ");
				if( sc.next().toUpperCase().charAt(0) == 'Y' )
					return;
			default: System.out.println("올바른 메뉴를 입력해주세요."); break;
			}
			
		}while(true);
		
		
	}
	
	public void searchMenu(){
		String menu = "\n***** 회원 정보 검색 메뉴 *****\n\n"+
				
				"1. 아이디로 검색\n"+
				"2. 이름으로 검색\n"+
				"3. 이메일로 검색\n"+
				"9. 이전 메뉴로 가기\n"+
				"메뉴 선택 : ";
		
		do {
			System.out.print(menu);
			int no = sc.nextInt();
			int idx = 0;
			switch (no) {
			case 1:	
				System.out.print("검색할 회원 아이디를 입력하세요 : ");
				String id = sc.next();
				idx = mManager.searchMemberId(id); 
				if (idx > -1)
					mManager.printMember(idx);
				else
					System.out.println("회원정보가 존재하지 않습니다.");
				break;
			case 2:	
				System.out.print("검색할 회원 이름을 입력하세요 : ");
				String name = sc.next();
				idx = mManager.searchMemberName(name); 
				if (idx > -1)
					mManager.printMember(idx);
				else
					System.out.println("회원정보가 존재하지 않습니다.");
				break;
			case 3:	
				System.out.print("검색할 회원 이메일을 입력하세요 : ");
				String email = sc.next();
				idx = mManager.searchMemberEmail(email); 
				if (idx > -1)
					mManager.printMember(idx);
				else
					System.out.println("회원정보가 존재하지 않습니다.");
				break;
			case 9:	System.out.println("이전 메뉴로 돌아갑니다."); return;
			default: System.out.println("올바른 메뉴를 입력해주세요."); break;
			}
			
		}while(true);
		
	}
	
	public void sortMenu(){
		String menu =	"\n***** 회원 정보 정렬 출력 메뉴 *****\n\n"+
				
				"1. 아이디 오름차순 정렬 출력\n"+
				"2. 아이디 내림차순 정렬 출력\n"+
				"3. 나이 오름차순 정렬 출력\n"+
				"4. 나이 내림차순 정렬 출력\n"+
				"5. 성별 내림차순 정렬 출력(남여순)\n"+
				"9. 이전 메뉴로 가기\n"+
				"메뉴 선택 : ";
		
		do {
			System.out.print(menu);
			int no = sc.nextInt();
			switch (no) {
			case 1:	mManager.sortIDAsc(); break;
			case 2:	mManager.sortIDDes(); break;
			case 3:	mManager.sortAgeAsc(); break;
			case 4:	mManager.sortAgeDes(); break;
			case 5:	mManager.sortGenderDes(); break;
			case 9:	
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			}
			
		}while(true);
	}
	
	
	public void modifyMenu(){
		String menu=	"\n***** 회원 정보 수정 메뉴 *****\n\n"+

				"1. 암호 변경\n"+
				"2. 이메일 변경\n"+
				"3. 나이 변경\n"+
				"9. 이전 메뉴로 가기\n"+
				"메뉴 선택 : ";
		
		do {
			System.out.print(menu);
			int no = sc.nextInt();
			int idx = -1;
			switch (no) {
			case 1:	
				System.out.print("변경할 회원 아이디를 입력하세요 : ");
				String id = sc.next();
				idx = mManager.searchMemberId(id); 
				if (idx > -1) {
					mManager.printMember(idx);
					System.out.print("변경할 암호 : ");
					String password = sc.next();
					mManager.m[idx].setPassword(password);
					System.out.println("회원의 정보가 변경되었습니다.");
				}
				else
					System.out.println("회원정보가 존재하지 않습니다.");
				break;
			case 2:	
				System.out.print("변경할 회원 아이디를 입력하세요 : ");
				id = sc.next();
				idx = mManager.searchMemberId(id); 
				if (idx > -1) {
					mManager.printMember(idx);
					System.out.print("변경할 이메일주소 : ");
					String email = sc.next();
					mManager.m[idx].setEmail(email);
					System.out.println("회원의 정보가 변경되었습니다.");
				}
				else
					System.out.println("회원정보가 존재하지 않습니다.");
				break;
			case 3:	
				System.out.print("변경할 회원 아이디를 입력하세요 : ");
				id = sc.next();
				idx = mManager.searchMemberId(id); 
				if (idx > -1) {
					mManager.printMember(idx);
					System.out.print("변경할 나이 : ");
					int age = sc.nextInt();
					mManager.m[idx].setAge(age);
					System.out.println("회원의 정보가 변경되었습니다.");
				}
				else
					System.out.println("회원정보가 존재하지 않습니다.");
				break;
			case 9:	System.out.println("메인 메뉴로 화면 이동합니다."); return;
			default: System.out.println("올바른 메뉴를 입력해주세요."); break;
			}
			
		}while(true);
	}	
	
}
