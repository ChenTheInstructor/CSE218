package p5_sum;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(recursiveSum(10));
	}

	private static int recursiveSum(int n) {
		if (n == 1) {
			return 1;
		}
		return n + recursiveSum(n - 1) + n + recursiveSum(n - 1);
	}

}
