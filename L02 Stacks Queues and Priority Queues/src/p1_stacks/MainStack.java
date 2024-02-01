package p1_stacks;

public class MainStack {

	public static void main(String[] args) {
		StackX myStack = new StackX(10);
		System.out.println(myStack.isEmpty());
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		myStack.push(6);
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
//		System.out.println(myStack.isEmpty());
//		System.out.println(myStack.isFull());
//		System.out.println(myStack.peek());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.peek());
	}

}
