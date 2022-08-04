package operator.sample;

//비트 연산자 테스트용 클래스
//비트 연산자 : 메모리에 기록된 비트값(2진수 : bit 0, bit 1)을 계산에
//						사용하는 연산자임
//정수에만 사용됨
//2순위 : ~(tield : 비트반전연산자)
//5순위 : <<, >>, >>> (shift : 비트자리이동연산자)
//비트논리연산자 ; &(and, 8순위), ^(xor, 9순위), |(or, 10순위)
public class BitOperator {
	//메모리의 비트 1은 정수 1로, 비트 0은 정수 0으로 출력처리
	public void printBit(int num) {
		System.out.print(num + " : ");
		
		for(int pos = 31; pos >= 0; pos--) {
			System.out.print(num >> pos & 1);
		}
		System.out.println();
		
	}
	
	public void testBit() {
		int a = 12, b=20;
		
		printBit(a);
		printBit(b);
		
	   System.out.println("a 변수 비트");
	   printBit(a);
	   System.out.println("~a 비트 확인");
	   printBit(~a);
	   //~ 비트 반전연산 
	   
	   //양수의 0의 보수를 구한다면
	   printBit(~a + 1);
	   
	}

	
}
