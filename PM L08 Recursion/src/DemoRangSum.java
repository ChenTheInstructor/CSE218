
public class DemoRangSum {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("The sum of elements 2 through 5 is: " 
				+ rangSum(numbers, 2, 5));
	}

	private static int rangSum(int[] numbers, int start, int end) {
		if(start > end) {
			return 0;
		}
		return numbers[start] + rangSum(numbers, start+1, end);
	}

}
