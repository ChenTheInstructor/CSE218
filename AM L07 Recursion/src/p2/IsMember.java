package p2;

public class IsMember {
	private static int index = 0;
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6};
		System.out.println(isMember(nums, 15));
	}

	private static boolean isMember(int[] nums, int n) {
		if(index == nums.length) {
			return false;
		}
		if(nums[index] == n) {
			return true;
		} else {
			index++;
			return isMember(nums, n);
		}
	}

}
