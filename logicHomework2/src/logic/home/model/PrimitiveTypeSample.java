package logic.home.model;

import java.util.Scanner;

public class PrimitiveTypeSample {

	  public void typeSize(){ 
		  System.out.println("Byte 할당 바이트 : " + Byte.BYTES);
		  System.out.println("Short 할당 바이트 : " + Short.BYTES);
		  System.out.println("Integer 할당 바이트 : " + Integer.BYTES);
		  System.out.println("Long 할당 바이트 : " + Long.BYTES);
		  System.out.println("Float 할당 바이트 : " + Float.BYTES);
		  System.out.println("Double 할당 바이트 : " + Double.BYTES);
		  System.out.println("Character 할당 바이트 : " + Character.BYTES);

		  
	  }
	  public void minMaxValue(){
		  
			System.out.println("Byte최대값 : " + Byte.MAX_VALUE);
			System.out.println("Byte최소값 : " + Byte.MIN_VALUE);
			
			System.out.println("Short최대값 : " + Short.MAX_VALUE);
			System.out.println("Short최소값 : " + Short.MIN_VALUE);
			
			System.out.println("Integer최대값 : " + Integer.MAX_VALUE);
			System.out.println("Integer최소값 : " + Integer.MIN_VALUE);
			
			System.out.println("Long최대값 : " + Long.MAX_VALUE);
			System.out.println("Long최소값 : " + Long.MIN_VALUE);
			
			System.out.println("Float최대값 : " + Float.MAX_VALUE);
			System.out.println("Float최소값 : " + Float.MIN_VALUE);
			
			System.out.println("Double최대값 : " + Double.MAX_VALUE);
			System.out.println("Double최소값 : " + Double.MIN_VALUE);
			
			System.out.println("Character최대값 : " + (int)Character.MAX_VALUE);
			System.out.println("Character최소값 : " + (int)Character.MIN_VALUE);

	  }
	  public void bitSize(){
		  System.out.println("Byte기록 비트갯수 : " + Byte.SIZE);
		  System.out.println("Short기록 비트갯수 : " + Short.SIZE);
		  System.out.println("Integer기록 비트갯수 : " + Integer.SIZE);
		  System.out.println("Long기록 비트갯수 : " + Long.SIZE);
		  System.out.println("Float기록 비트갯수 : " + Float.SIZE);
		  System.out.println("Double기록 비트갯수 : " + Double.SIZE);
		  System.out.println("Character기록 비트갯수 : " + Character.SIZE);
	  }	
	
	
}
