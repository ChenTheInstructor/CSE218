package p4_lowerboundConstraints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLowerBoundConstraints {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Double> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();
		List<Object> list4 = new ArrayList<>();
		
		list1 = Arrays.asList(1, 2, 3, 4, 5);
		list2 = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
		list3 = Arrays.asList("1", "2", "3", "4");
		list4 = Arrays.asList("one", 1, 2.2);
		
		display(list1); // valid
		display(list2); // invalid
		display(list3); // invalid
		display(list4); // valid
	}
	
	public static <T> void display(List<? super Number> list) {
		for(Object value : list) {
			System.out.println(value);
		}
		System.out.println();
	}

}
