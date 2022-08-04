package test.operator;

import java.util.Scanner;

public class Example {
	//1
	public void sample1() {
		int kor, eng, math, tot;
		double avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.0;
		
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격":"불합격";
		System.out.println(result);
	}
	
	//2
	public void sample2() {
		String name;
		int age, classNo, no;
		char gender;
		double grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("학년 : ");
		age = sc.nextInt();
		System.out.print("반 : ");
		classNo = sc.nextInt();
		System.out.print("번호 : ");
		no = sc.nextInt();
		
		System.out.print("성별(M/F) : " );
		gender = sc.next().charAt(0);
		System.out.print("성적 : ");
		grade = sc.nextDouble();
		gender = gender=='M' ? '남':'여';
		
		System.out.printf("%d학년 %d반 %d번 %c학생 %s은(는) 성적이 %.2f이다.\n",
				age, classNo, no, gender, name, Math.floor(grade*100)/100);
	}
	
	//3
	public void sample3() {
			int inum;
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 입력하시오 : ");
			inum = sc.nextInt();
			
			String re = inum > 0 ? "양수다.":"양수가 아니다.";
			System.out.println(re);
		}
	
	public void sample4() {
		int inum;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		inum = sc.nextInt();
		str = inum%2 == 0 ? "짝수다": "홀수다";
		System.out.println(str);
	}
	
}
