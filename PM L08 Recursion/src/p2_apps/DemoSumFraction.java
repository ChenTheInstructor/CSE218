package p2_apps;

public class DemoSumFraction {

	public static void main(String[] args) {
		System.out.println("The sum is: " + sumFraction(10));
	}
// The main purpose of using recursion is to reduce the size of 
// the problem with each recursive call
	private static double sumFraction(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (1.0/n + sumFraction(n - 1));
		}
	}

}
