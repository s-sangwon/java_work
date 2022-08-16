package oop.inheritance.sample;

import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.Objects;

public class Shape {

	//Field
	private double area; //면적
	private double perimeter; //둘레
	
	//Constructor
	public Shape() {
		super();
		System.out.println("Shape() 실행됨.");
	}
	public Shape(double area, double perimeter) {
		super();
		this.area = area;
		this.perimeter = perimeter;
		System.out.println("Shape(area, perimeter) 실행됨.");
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	//protected : 비상속시에는 default(package priavte) 와 같음
	protected String info() /* throws IOException, SQLException */{
		return area + 
				 ", " + perimeter;
	}
	
	@Override
	public Object clone()  // 새로운 복사 객체 만들기
	{
		return new Shape(this.area, this.perimeter);
	}
	
	//부모 메소드 오버라이딩(재정의) 하면 부모의 같은 이름의 메소드는 자동 은닉됨hiding => 후손 메소드가 우선권을 갖음
	@Override
	public String toString() {
		//후손 메소드 안에서 자동 은닉된 부모메소드 사용하려면
		//super.부모메소드명() 으로 표기하면 됨
		return super.toString() + "Shape [area=" + area + ", perimeter=" + perimeter + "]";
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(area, perimeter);
//	}
	@Override
	public boolean equals(Object obj) {
		//두 객체의 this가 참조하는 객체와 전달받은 obj가 참조하는 객체
		//값들이 같은지 비교하는 내용으로 변경함
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shape other = (Shape) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Double.doubleToLongBits(perimeter) == Double.doubleToLongBits(other.perimeter);
	}
}



