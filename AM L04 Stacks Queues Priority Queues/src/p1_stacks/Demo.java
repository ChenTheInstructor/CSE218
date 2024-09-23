package p1_stacks;

public class Demo {

	public static void main(String[] args) {
		StackX myStack = new StackX(10);
		System.out.println(myStack.isEmpty());
		myStack.push(10);
		myStack.push(20);
		System.out.println(myStack.isEmpty());
		myStack.push(30);
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}

}
