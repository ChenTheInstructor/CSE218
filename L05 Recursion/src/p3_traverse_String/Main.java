package p3_traverse_String;

public class Main {

	public static void main(String[] args) {
		String str = "123629";
		System.out.println(isPalindrome(str));
	}

	private static boolean isPalindrome(String str) {

		return showStrHelper(str, 0, str.length() - 1);
	}

	private static boolean showStrHelper(String str, int front, int back) {

		if (front >= back) {
			return true;
		}

		if (str.charAt(back) != str.charAt(front)) {
			return false;
		}
		return showStrHelper(str, ++front, --back);
	}

}
