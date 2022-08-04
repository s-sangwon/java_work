package logic.run;
import logic.sample.*;

public class TestLogic {

	public static void main(String[] args) {
		//제어문 실행 테스트용
		IfSample samp = new IfSample();
		
//		samp.testIf2();
		
//		samp.testIf3();
		
		IfElseSample iesamp = new IfElseSample();
		
//		iesamp.testIfElse1();
		
//		iesamp.testIfElse2();
		
//		iesamp.testIfElse3();
		
		IfElseIfSample samp3 = new IfElseIfSample();
//		samp3.testThreeMax();
//		samp3.testScoreGrade();
		//클래스명 참조변수명 = new 클래스명();
		//new : 동적메모리(ram : heap영역)에 객체공간을 만들어라
		//생성자가 없으면 jvm이 자동으로 기본생성자를 추가하면서 컴파일함.
		
		SwitchSample swsmp = new SwitchSample();
		
//		swsmp.test1();
//		swsmp.calculator();
//		swsmp.test2();
		
//		swsmp.test2ChangeIf();
		
		DoWhileSample dws = new DoWhileSample();
		
//		dws.printUnicode2();
		dws.displayMenu();
	}
	
	

}
