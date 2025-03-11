package p1_intro;

public class Greetings {
	private static int count = 0;
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("hi\t" + count++ );
		}
//		message("hi");
//		System.out.println("main method is finishing...");
	}

	private static void message(String msg) {
		if(count == 5) { // base case when the method terminates
			return;
		}
		System.out.println(msg + "\t" + count++);
		message(msg);
	}

}
