package p1_intro;

public class Demo {
	private static int n = 0;
	public static void main(String[] args) {
		greetings();
	}

	private static void greetings() {
		while(true) {
			System.out.println("Hi! " + ++n);
		}
//		if(n >= 3) { // base case: terminate recursion
//			return;
//		}
//		System.out.println("Hi! " + ++n);
//		greetings(); // recursive case
	}

}
