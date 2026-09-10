package p1_stacks;

public class Main {

	public static void main(String[] args) {
		Stackx myStack = new Stackx(10);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		myStack.push(60);
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}
	
}
