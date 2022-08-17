package test.abst;

import java.io.Serializable;

public interface ICalc extends IGrade, Serializable {
	int sum(int a, int b);
	int sub(int a, int b);
	int mul(int a, int b);
	int div(int a, int b);
}
