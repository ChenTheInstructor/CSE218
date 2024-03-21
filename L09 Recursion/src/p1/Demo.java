package p1;

public class Demo {

	private static int n = 3;

	public static void main(String[] args) {
		showMessage(n);
	}

	private static void showMessage(int n) {
		if (n < 1) { // base case
			return;
		}

		System.out.println("Hi");
		showMessage(--n);
	}

}
