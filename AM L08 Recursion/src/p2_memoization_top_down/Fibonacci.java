package p2_memoization_top_down;

import java.util.HashMap;

public class Fibonacci {
	private static HashMap<Integer, Integer> memo = new HashMap<>();
	
	public static void main(String[] args) {
		System.out.println(fib(1));
	}

	private static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		if (memo.containsKey(n)) {
			return memo.get(n);
		} else {
			int result = fib(n - 1) + fib(n - 2);
			memo.put(n, result);
			return result;
		}
	}

}
