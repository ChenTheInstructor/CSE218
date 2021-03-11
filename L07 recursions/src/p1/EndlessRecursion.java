package p1;

public class EndlessRecursion {
	
	private static int counter = 0;
	
	public static void main(String[] args) {
		message(counter);
		System.out.println("Main method finishes");
	}
	
	private static void message(int counter) {
		if(counter >= 100) { // base case
			return;
		}
		System.out.println("Hi " + counter);
		counter++;
		message(counter);
		System.out.println("About to return and finish the message method!");
	}

}
