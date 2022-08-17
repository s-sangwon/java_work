package oop.controller;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.Rectangle;
import inherit.polymorphism.model.Triangle;
import test.abst.IShape;

public class TestPolyPractice3 {

	public static void main(String[] args) {
		IShape[] iarr = new IShape[5];
		                                                              
		iarr[0] = new Circle(15.5);                                   
		iarr[1] = new Rectangle(34.5, 42.7);                          
		iarr[2] = new Triangle(12.5,12.5);                            
		iarr[3] = new Triangle(2.31, 3.71);                           
		iarr[4] = new Circle(25.74);                                  
		                                                              
		for(IShape ar : iarr) {                                       
			if(ar instanceof Circle) {
				System.out.println(("원면적 : " + ar.area()));
				System.out.println(("원둘레 : " + ar.perimeter()));
			}else if(ar instanceof Rectangle) {
				System.out.println(("사각형면적 : " + ar.area()));
				System.out.println(("사각형둘레 : " + ar.perimeter()));
			}else if(ar instanceof Triangle) {
				System.out.println(("삼각형면적 : " + ar.area()));
				System.out.println(("삼각형둘레 : " + ar.perimeter()));
				System.out.println(("삼각형 빗변길이 : " + ((Triangle)ar).getHypotenuse()));
			}
			System.out.println();
		}
	}

}
