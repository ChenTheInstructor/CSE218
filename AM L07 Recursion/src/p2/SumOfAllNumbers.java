package p2;

public class SumOfAllNumbers {

	public static void main(String[] args) {
		System.out.println(sumNum(10));
	}

	private static int sumNum(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + sumNum(n - 1);
		}
	}

}
