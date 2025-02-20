package p1_stacks;

public class MainDemo {

	public static void main(String[] args) {
		final int STACK_SIZE = 5;
		StackX myStack = new StackX(STACK_SIZE);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
		
	}

}
