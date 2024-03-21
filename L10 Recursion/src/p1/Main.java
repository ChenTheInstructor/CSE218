package p1;

public class Main {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3}; //, 4, 5, 6, 7, 8, 9, 10 };
		int total = rangeSum(numbers);
		System.out.println(total);
	}
	
	private static int rangeSum(int[] numbers) {
		return rangeSum(numbers, 0, numbers.length - 1);
	}

	private static int rangeSum(int[] numbers, int start, int end) {
		if (start > end) {
			return 0;
		}

		return numbers[end] + rangeSum(numbers, start, end - 1);
	}

}
