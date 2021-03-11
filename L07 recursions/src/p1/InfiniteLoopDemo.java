package p1;

public class InfiniteLoopDemo {

	public static void main(String[] args) {
		int counter = 0;
		while(true) {
			System.out.println(counter);
			counter++;
		}
	}

}
