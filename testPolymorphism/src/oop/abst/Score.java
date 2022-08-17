package oop.abst;

import java.io.Serializable;

import test.abst.ICalc;
import test.abst.IGrade;

public class Score extends SampleSuper
	implements IGrade, ICalc, Serializable{

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
