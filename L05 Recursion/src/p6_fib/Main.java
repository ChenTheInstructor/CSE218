package p6_fib;

public class Main {

	public static void main(String[] args) {
		System.out.println(fib(6));
	}
	
	public static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		
		return fib(n - 1) + fib(n-2);
	}
	

}
