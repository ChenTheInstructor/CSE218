package p1_integers;

public class Demo {

	public static void main(String[] args) {
		BasicSorting s1 = new BasicSorting(10);
		s1.insert(5);
		s1.insert(1);
		s1.insert(7);
		s1.insert(3);
		s1.insert(6);
		s1.insert(2);
		s1.insert(8);
		s1.insert(4);
		s1.display();
		s1.insertionSort();
		s1.display();
	}

}
