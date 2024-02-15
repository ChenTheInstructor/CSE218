package p1;

public interface Computable {
	// all variables are public, static, and final
	double add(double n1, double n2);
	double subtract(double n1, double n2);
	double multiply(double n1, double n2);
	double divide(double n1, double n2);
	
	public static String getName() {
		return "My Calculator";
	}
	
	public default double getPrice() {
		return 99.99;
	}
	
//	public int getAge() {
//		return 20;
//	}
}
