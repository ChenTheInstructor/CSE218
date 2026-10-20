package p1;

public class Demo1 {
//	static int count = 0;

	public static void main(String[] args) {
		int count = 1;
		message(count);
		System.out.println("C: " + count);
		System.out.println("Bye");
	}

	public static void message(int c) {
		System.out.println("Hi\t" + c);
		if(c>= 5) { // basecase
			return;
		}
		message(++c);
	}

}
