package edu.mondragon.junit.first;

public class MyClass {
	public int multiply(int x, int y) {
		// the following is just an example
		if (x > 999) {
			throw new IllegalArgumentException("X should be less than 1000");
		}
		return x * y;
	}
	protected int suma(int x, int y) {
		// the following is just an example
		return x + y;
	}
	private int division(int x, int y) {
		if (y == 0) {
			return (-1);
		}
		return x / y;
	}
	private Boolean methodToBeTested(String argument) {
		return false;
	}
}
