package p2_sum_fraction;

public class Main {

	public static void main(String[] args) {
		double total = sumFraction(5);
		System.out.println(total);
	}

	private static double sumFraction(int n) {
		if(n == 1) {
			return 1;
		}
		return 1.0/n + sumFraction(n - 1);
	}

}
