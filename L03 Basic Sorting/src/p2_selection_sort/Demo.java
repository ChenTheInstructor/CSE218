package p2_selection_sort;

public class Demo {

	public static void main(String[] args) {
		for (int j = 5000; j < 500000; j += 5000) {
			ArraySelection arr = new ArraySelection(j);
			for (int i = 0; i < j; i++) {
				arr.insert((int) (Math.random() * j));
				//		arr.insert(2);
				//		arr.insert(6);
				//		arr.insert(9);
				//		arr.insert(1);
				//		arr.insert(7);
				//		arr.insert(3);
				//		arr.insert(2);
				//		arr.insert(0);
				//		arr.insert(8);
			}
//			arr.display();
			long start = System.currentTimeMillis();
			arr.selectionSort();
			System.out.println("Time Took: " + (System.currentTimeMillis() - start));
//			arr.display();
		}
	}

}
