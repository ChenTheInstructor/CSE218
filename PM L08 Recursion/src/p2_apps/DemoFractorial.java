package p2_apps;

public class DemoFractorial {

	public static void main(String[] args) {
		long solution = factorial(15);
		System.out.println("The solution: " + solution);
	}

	private static long factorial(int n) {
		if(n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
