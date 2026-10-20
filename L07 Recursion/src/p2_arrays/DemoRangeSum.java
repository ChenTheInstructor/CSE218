package p2_arrays;

public class DemoRangeSum {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("The sum of elements 2 through 5 is: " + rangeSum(nums, 2, 5));
	}
	
//	public static int rangeSum(int[] arr, int start, int end) {
//		int total = 0;
//		for(int i = start; i <= end; i++) {
//			total += arr[i];
//		}
//		return total;
//	}

//	public static int rangeSum(int[] a) {
//		return rangeSum(a, 0, a.length - 1);
//	}
//
	private static int rangeSum(int[] nums, int start, int end) {
		if (start > end) {
			return 0;
		}
		return nums[start] + rangeSum(nums, start + 1, end);
	}

}
