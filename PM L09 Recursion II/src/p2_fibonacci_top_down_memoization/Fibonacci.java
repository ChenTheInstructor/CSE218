package p2_fibonacci_top_down_memoization;

import java.util.HashMap;

public class Fibonacci {
	private static HashMap<Integer, Integer> memo = new HashMap<>();
	
	public static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		
		int result =  fib(n - 1) + fib(n - 2);
		memo.put(n, result);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(fib(1));
	}
}
