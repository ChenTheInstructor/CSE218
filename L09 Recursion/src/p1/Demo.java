package p1;

public class Demo {

	public static void main(String[] args) {
		showMessage();
	}

//	private static void showMessage() {
//		while(true) {
//			System.out.println("Hi");
//		}
//	}

	private static void showMessage() {
		System.out.println("Hi");
		showMessage();
	}

	
}
