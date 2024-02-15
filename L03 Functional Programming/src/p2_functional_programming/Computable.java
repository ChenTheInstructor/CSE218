package p2_functional_programming;

// functional interface
public interface Computable {
	double compute(double n1, double n2);
//	double compute2(double n1, double n2);
	
	public static String getName() {
		return "My Calculator";
	}
	
	public default double getPrice() {
		return 99.99;
	}
}
