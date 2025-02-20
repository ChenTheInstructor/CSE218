package p4_properties;

public class Demo {

	public static void main(String[] args) {
		GenericBag<Integer> myBag1 = new GenericBag<>(10);
		myBag1.add(10);
		myBag1.add(20);
		myBag1.add(30);
		myBag1.display();
		System.out.println("-----------------");
		GenericBag<String> myBag2 = new GenericBag<>(10);
		myBag2.add("A");
		myBag2.add("B");
		myBag2.add("C");
		myBag2.display();
	}

}
