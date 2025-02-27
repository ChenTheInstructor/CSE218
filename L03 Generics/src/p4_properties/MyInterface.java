package p4_properties;

public interface MyInterface {
	// public, static and final
//	double n3 = 10.5;
//	double n4 = 11.5;
	
//	double add(double n1, double n2);
	double subtract(double n1, double n2);
	
	static double multiply(double n1, double n2) {
		return n1 * n2;
	}
	
	default double divide(double n1, double n2) {
		return n1 / n2;
	}
	
	

}
