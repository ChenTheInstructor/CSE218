package p1;

public class Demo {
	private static int n = 0;

	public static void main(String[] args) {
//		Problem p;
//		greetings(p);
	}

	private static void greetings() {
		if (n > 10) { // base case
			return;
		}
		System.out.println(n++ + " Hi");
		greetings(/*simpler p**/); // recursive case
//		while(true) {
//			System.out.println(n++ + " Hi");
//		}
	}

}
