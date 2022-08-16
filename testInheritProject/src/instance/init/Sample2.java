package instance.init;

public class Sample2 {
	//Field
	private String name = "noname";
	private int age = 19; //명시적 초기ㅗ하
	private char gender; //jvm 이 준비한 기본값으로 초기화
	private double height; //jvm 이 준비한 기본값으로 초기화
	private boolean yesNo; //jvm 이 준비한 기본값으로 초기화
	
	private static int count = 1; //명시적 초기ㅗ하
	private static String message = "nomessage";

	//초기화 블럭
	
	//인스턴스 변수 초기화 블럭
	{
		name = "홍길동";
		age = 30;
		gender = '남';
		height = 178.5;
		yesNo = true;
	}
	
	//클래스 변수 초기화 블럭
	static {
		count = 10;
		message = "객체들이 공유하는 문자열값";
	}
	
	
	public Sample2() {
	
		name = "이순신";
		age = 30;
		gender = '남';
		height = 178.51;
		yesNo = true;
		
	} //jvm이 준비한 기본값

	
	
	@Override
	public String toString() {
		return "Sample2 [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + ", yesNo="
				+ yesNo + ", " +" count=" + count + ", message="+message +"]";
	}
	
	
}
