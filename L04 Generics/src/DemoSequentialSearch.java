
public class DemoSequentialSearch {

	public static void main(String[] args) {
		String[] names = {"B", "A", "D", "T", "C"};
		Integer[] numbers = {1, 7, 3, 2, 9, 4};
		int position1 = sequentialSearch(names, "T");
		int position2 = sequentialSearch(numbers, 3);
		int position3 = sequentialSearch(names, "Z");
		System.out.println(position1);
		System.out.println(position2);
		System.out.println(position3);
		
	}
	
	public static <E extends Comparable<E>> int sequentialSearch(E[] array, E value) {
		int index = 0;
		int position = -1;
		boolean found = false;
		 
		while(!found && index < array.length) {
			if(array[index].compareTo(value) == 0) {
				found = true;
				position = index;
			}
			index++;
		}
		return position;
	}

}
