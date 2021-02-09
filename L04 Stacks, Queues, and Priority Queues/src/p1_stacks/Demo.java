package p1_stacks;

public class Demo {

	public static void main(String[] args) {
		StackX theStack = new StackX(5);
		
		long number = 10;
		while(!theStack.isFull()) {
		theStack.push(number);
		number += 10;
		}
		
		while(!theStack.isEmpty()) {
			System.out.println(theStack.pop());
		}
		
	}

}
