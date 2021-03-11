package p3;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("The sum is " + sumFraction(3));
	}

	private static double sumFraction(int n) {
		if(n == 1) {
			return 1.0;
		}
		return 1.0/n + sumFraction(n-1);
	}

}

//return 1.0/5 + sumFraction(4);
//return 1.0/5 + 1.0/4 + sumFraction(3);
//return 1.0/5 + 1.0/4 + 1.0/3 + sumFraction(2);
//return 1.0/5 + 1.0/4 + 1.0/3 + 1.0/2 + sumFraction(1);