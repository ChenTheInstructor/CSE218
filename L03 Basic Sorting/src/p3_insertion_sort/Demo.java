package p3_insertion_sort;

public class Demo {

	public static void main(String[] args) {
		for (int j = 5000; j < 500000; j += 5000) {
			ArrayInsertion arr = new ArrayInsertion(j);
			for (int i = 0; i < j; i++) {
				arr.insert(i);
//				arr.insert((int) (Math.random() * j));
//						arr.insert(2);
//						arr.insert(6);
//						arr.insert(9);
//						arr.insert(1);
//						arr.insert(7);
//						arr.insert(3);
//						arr.insert(2);
//						arr.insert(0);
//						arr.insert(8);
			}
//				arr.display();
			long start = System.nanoTime();
			arr.insertionSort();
			System.out.println("Time Took: " + (System.nanoTime() - start));
//				arr.display();
		}
	}

}
