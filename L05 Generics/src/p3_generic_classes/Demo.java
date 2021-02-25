package p3_generic_classes;

import java.util.ArrayList;
import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
//		Stack<Integer> myStack = new Stack<>();
		Point<String> p1 = new Point<>("Two", "Four");
		Point<Integer> p2 = new Point<>(2, 4);
		Point<Double> p3 = new Point<>(2.0, 4.0);
		
		Point<Object> p4 = new Point<>("TWO", "FOUR");
		
		Point<Number> p5 = new Point<>(1.1, 2.2);
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
		
		Point.display(p5);
		Point.display(p2);
	}

}


// write a generic sequential search method, binary search method, generic sorting, generic stack, queue, and priority queue classes