package p1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		QuickStack<Integer> s1 = new QuickStack<>();
//		s1.push(1);
//		s1.push(2);
//		s1.push(3);
//		System.out.println(s1.size());
//		System.out.println(s1.pop());
//		System.out.println(s1.pop());
		System.out.println("Initial size: " + s1.size());
		Integer[] a = { 1, 2, 3, 4, 50 };
		s1.pushAll(a);

		System.out.println("Size after pushAll: " + s1.size());
		System.out.println(Arrays.toString(s1.popAll()));
	}

}
