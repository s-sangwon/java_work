package instance.init;

public class Sample {
	//Field
	private int num;
	private static int snum;
	
	//Constructor
	//반환형 없음. 클래스명과 이름이 같아야 함 : 메소드와 다름
	public Sample() {
		this(100); // 생성자 안에서 다른생성자 호출할 수도 있다.
		snum++;
	}
	
	//복사 생성자 :
	//새로운 객체 생성시 다른 객체가 가진 필드값을 복사해서 초기화에 사용하는 생성자.
	public Sample(Sample s) {
		this(s.num);
	}
	
	
	
	//오버로딩(중복) 클래스 안에 같은이름의 메소드, 생성자가 여러개 작성되는 것
	// 완전히 같지는 않고 매개변수가 다르게 구성디ㅗ어야함
	//오버라이딩(재정의)
	public Sample(int num) {
		this.num = num;
	}
	
	


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static int getSnum() {
		return snum;
	}

	public static void setSnum(int snum) {
		Sample.snum = snum;
	}

	@Override
	public String toString() {
		return "Sample [num=" + num + "]";
	}
	
	public double round(double d, int i) {
		double a = Math.pow(10, i);
		return Math.round(d*a)/a;
	}
}
