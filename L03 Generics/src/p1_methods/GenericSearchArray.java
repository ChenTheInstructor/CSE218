package p1_methods;

public class GenericSearchArray {

	public static void main(String[] args) {
		String[] names = { "J", "A", "D", "M", "Z" };
		Integer[] numbers = { 3, 5, 1, 9, 2, 7 };
		Student[] students = { new Student("M", 2.5), new Student("A", 4.0), new Student("Z", 1.9) };

		System.out.println(sequentialSearch(names, "D"));
		System.out.println(sequentialSearch(numbers, 9));
		System.out.println(sequentialSearch(students, new Student("A", 4.0)));
	}

	public static <E extends Comparable> int sequentialSearch(E[] names, E value) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

//	public static int sequentialSearch(Integer[] nums, Integer num) {
//		for (int i = 0; i < nums.length; i++) {
//			if(nums[i].equals(num)) {
//				return i;
//			}
//		}
//		return -1;
//	}
}
