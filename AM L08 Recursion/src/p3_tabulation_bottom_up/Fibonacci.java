package p3_tabulation_bottom_up;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fib(10));
	}

	private static int fib(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i < n + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

}
