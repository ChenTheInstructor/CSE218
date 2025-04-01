package p6_fib;

import java.util.HashMap;
import java.util.Map;

public class FibMemoization {
	static Map<Integer, Integer> memo = new HashMap<>();

	public static void main(String[] args) {
		System.out.println(fib(6));
	}

	private static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		
		int result = fib(n-1) + fib(n-2);
		memo.put(n, result);
		return result;
	}
	
	

}
