package com.practice2.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Point;
import com.practice2.model.entity.Rectangle;



public class Main {

	public static void main(String[] args) {
		Circle car[] = new Circle[3];
		Rectangle rar[] = new Rectangle[3];
		
		
//		for(int i=0; i<car.length; i++) {
//			car[i] = new Circle(i+1,i+1,i+1);
//			rar[i] = new Rectangle(i+1,i+1,i+1,i+1);
//		}
//		
//		for(int i=0; i<car.length; i++) {
//			car[i].draw();
//			rar[i].draw();
//		}
		
//		Point p[] = new Point[5];
//		
//		for(int i=0; i<p.length; i++) {
//			if(i % 2 == 0)
//				p[i] = new Circle(i+1,i+1,i+1);
//			else
//				p[i] = new Rectangle(i+1,i+1,i+1,i+1);
//		}
//		
//		for(Point ar : p) {
//			ar.draw();
//		}
		
		car[0] = new Circle(1,1,1);
		
		long startTime = System.currentTimeMillis();

		for(int i = 0; i < 100000; i++) {
			car[0].draw2(); 
		}
		long stop1 = System.currentTimeMillis();
		System.out.println((stop1-startTime) + "(ms)");

	}

}
