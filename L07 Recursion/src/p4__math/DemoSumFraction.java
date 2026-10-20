package p4__math;

public class DemoSumFraction {

	public static void main(String[] args) {
		System.out.println("The sum is " + sumFraction(3));
	}

	private static double sumFraction(int n) {
		if(n == 1) {
			return 1;
		}
		return 1.0/n + sumFraction(n - 1);
	}

}
