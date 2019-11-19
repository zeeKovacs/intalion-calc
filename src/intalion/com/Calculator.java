package intalion.com;

public class Calculator implements Operations {

	@Override
	public double addition(double a, double b) {
		return a + b;
	}

	@Override
	public double substraction(double a, double b) {
		return a - b;
	}

	@Override
	public double multiplication(double a, double b) {
		return a * b;
	}

	@Override
	public double dividation(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("Divison by zero is forbidden.");		
		}
		return a / b;
	}
	
	

}
 