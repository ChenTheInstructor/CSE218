package p1;

public class Calculator implements Computable{

	@Override
	public double add(double n1, double n2) {
		return n1 + n2;
	}

	@Override
	public double subtract(double n1, double n2) {
		return n1 - n2;
	}

	@Override
	public double multiply(double n1, double n2) {
		return n1 * n2;
	}

	@Override
	public double divide(double n1, double n2) {
		return n1 / n2;
	}

	public double getPrice() {
		return 109.99;
	}
}
