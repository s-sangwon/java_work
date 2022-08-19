package test.wrapper;

public class TestWrapperClass {

	public static void main(String[] args) {
		// 기본자료형(Primitive Type) : 8개 => 값
		// java.lang 패키지에 기본자료형에 대한 클래스들이 제공됨
		// Boolean >> Boolean, char >> Character, byte >> Byte
		// short >> Short, int >> Integer, float >> Float,
		// long >> Long, double >> Double
		// 래퍼(wrapper) 클래스라고 함
		
		// Boxing (기본자료형 값 => 객체로 바꿈)
		
		int num = 123;
		Integer intObj = new Integer(num);
		Integer ref = Integer.valueOf(num);
		
		System.out.println(intObj + ", " + ref);
		
		//UnBoxing(객체 => 기본자료형 값으로 바꾸는 것)
		//각 래퍼클래스 메소드로 제공됨 : 자료형Value() 사용
		int num2 = ref.intValue();
		
		System.out.println(num2);
	
	
		//parsing(문자열형태 값 => 각 자료형 값으로 바꾸는 것)
		//각 자료형별 래퍼클래스 메소드로 제공됨 : parse(자료형() 사용
		String str = "34.5";
		double value = Double.parseDouble(str);
		System.out.println(value);
		
	}

}
