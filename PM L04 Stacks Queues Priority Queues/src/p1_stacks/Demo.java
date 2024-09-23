package p1_stacks;

public class Demo {

	public static void main(String[] args) {
		StackX myStack = new StackX(5);
//		myStack.push(10);
//		myStack.push(20);
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.isEmpty());
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		myStack.push(60);
		myStack.push(70);
		System.out.println(myStack.isFull());
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
//		myStack.push(80);
	}

}
