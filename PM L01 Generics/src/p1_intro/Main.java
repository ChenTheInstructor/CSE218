//Generics uses a placeholder to represent a reference data type
package p1_intro;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(1.1);// autoboxing
		list1.add("Hi");
	}

}
