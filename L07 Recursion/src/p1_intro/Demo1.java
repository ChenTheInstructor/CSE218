
package p1_intro;

public class Demo1 {
	
	public static void main(String[] args) {
		int n  = 0;
			showMessage(n);
	}

	public static void showMessage(int m) {
		if(m >= 3) { // base case
			return;
		}
		System.out.println(++m + ": Hi");
		showMessage(m);
	}

}
