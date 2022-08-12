package member.model.dao;

import java.util.Scanner;

import member.model.dto.Member;

public class MemberManager {
	public static final int SIZE = 10;
	public Member[] m;
	private int memberCount;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {
		super();
		memberCount = 0;
		m = new Member[SIZE];
	}
	
	public int getMemberCount() {
		return memberCount;
	}
	
	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}
	
	public void memberInput() {
		String id, name, password, email;
		char gender;
		int age;
		
		System.out.print("아이디 : ");
		id = sc.next();
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("패스워드 : ");
		password = sc.next();
		System.out.print("이메일주소 : ");
		email = sc.next();
		
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		m[memberCount++] = new Member(id, name, password, email, gender, age);
		
		System.out.println("회원등록 완료.");
	}
	
	public int searchMemberId(String id) {

		int result=-1;
//		System.out.print("검색할 회원 아이디를 입력하세요 : ");
//		id = sc.next();
		for(int i=0; i<memberCount; i++) {
			if( m[i].getId().equals(id)) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	public int searchMemberName(String name) {

		int result=-1;
//		System.out.print("검색할 회원 이름를 입력하세요 : ");
//		id = sc.next();
		for(int i=0; i<memberCount; i++) {
			if( m[i].getName().equals(name)) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	public int searchMemberEmail(String email) {

		int result=-1;
//		System.out.print("검색할 회원 이메일을 입력하세요 : ");
//		id = sc.next();
		for(int i=0; i<memberCount; i++) {
			if( m[i].getEmail().equals(email)) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	public void printMember(int index) {
		System.out.println(m[index].memberInfo());
	}
	
	public void deleteMember() {
		for(int i=0; i<memberCount; i++) {
			m[i] = null;
		}
		memberCount = 0;
		System.out.println("회원 삭제 완료");
	}
	
	public void printAllMember() {
		for(int i=0; i<memberCount; i++)
			printMember(i);
	}
	
	//sort
	public void memberSwap(int a, int b) {
		Member temp = m[a];
		m[a] = m[b];
		m[b] = temp;
		System.out.println("swap member(index)" + a +"<->" +b);
	}
	
	public void sortIDAsc() {
		for(int start=0; start<memberCount-1; start++) {
			int minValueIndex=start;
			for(int i=start; i<memberCount; i++) {
				if(m[i].getId().compareTo(m[minValueIndex].getId()) < 0)
					minValueIndex = i;
			}
			memberSwap(start, minValueIndex);
		}
		System.out.println("sort end");
	}
	
	public void sortIDDes() {
		for(int start=0; start<memberCount-1; start++) {
			int maxValueIndex=start;
			for(int i=start; i<memberCount; i++) {
				if(m[i].getId().compareTo(m[maxValueIndex].getId()) > 0)
					maxValueIndex = i;
			}
			memberSwap(start, maxValueIndex);
		}
		System.out.println("sort end");
		
	}
	
	public void sortAgeAsc() {
		for(int start=0; start<memberCount-1; start++) {
			int minValueIndex=start;
			for(int i=start; i<memberCount; i++) {
				//if(m[i].getId().compareTo(m[minValueIndex].getId()) < 0)
				if(m[i].getAge() < m[minValueIndex].getAge())	
					minValueIndex = i;
			}
			memberSwap(start, minValueIndex);
		}
		System.out.println("sort end");
	}
	
	public void sortAgeDes() {
		for(int start=0; start<memberCount-1; start++) {
			int maxValueIndex=start;
			for(int i=start; i<memberCount; i++) {
				//if(m[i].getId().compareTo(m[minValueIndex].getId()) < 0)
				if(m[i].getAge() > m[maxValueIndex].getAge())	
					maxValueIndex = i;
			}
			memberSwap(start, maxValueIndex);
		}
		System.out.println("sort end");
	}
	
	public void sortGenderDes() {
		for(int start=0; start<memberCount-1; start++) {
			int maxValueIndex=start;
			for(int i=start; i<memberCount; i++) {
				//if(m[i].getId().compareTo(m[minValueIndex].getId()) < 0)
				if(m[i].getGender() > m[maxValueIndex].getGender())	
					maxValueIndex = i;
			}
			memberSwap(start, maxValueIndex);
		}
		System.out.println("sort end");
	}
}
