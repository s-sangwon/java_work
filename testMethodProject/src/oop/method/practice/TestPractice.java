package oop.method.practice;

public class TestPractice {

	public static void main(String[] args) {
		NonStaticSample2 test = new NonStaticSample2();
		int[] ar = test.intArrayAllocation(6);
		
//		for(int i=0; i<ar.length; i++)
//			System.out.print(ar[i] + "\t");
//		System.out.println();
		
		//test.swap(ar, 0, 4);
		
//		test.sortAscending(ar);
//		test.sortDescending(ar);
		
		System.out.println(test.countChar("apple", 'p') + "개"); 
		
		System.out.println(test.totalValue(100, 1));
		
		System.out.println(test.pConcat("hello!", "Java" ));
		
	}

}
