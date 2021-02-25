package p1_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Name> list1 = new ArrayList<>();
//		list1.add(1);
//		list1.add("Two");
//		list1.add(1.1);
		Name n1 = new Name("A", "A");
		Name n2 = new Name("B", "Z");
		Name n3 = new Name("C", "P");
		
		Name[] names = new Name[3];
		names[0] = n2;
		names[1] = n1;
		names[2] = n3;
		
//		Comparator<Name> myComparator = new Comparator<>() {
//
//			@Override
//			public int compare(Name o1 , Name o2) {
//				return o1.getLn().compareTo(o2.getLn());
//			}
//			
//		};
		
		Arrays.sort(names, ((o1, o2) -> o1.getLn().compareTo(o2.getLn())));
		
		for(Name n : names) {
			System.out.println(n);
		}
	}

}
