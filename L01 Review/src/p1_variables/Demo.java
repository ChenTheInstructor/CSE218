package p1_variables;

public class Demo {

	public static void main(String[] args) {
		//Category 1: primitive variables
		int i = 10; // 4 bytes
		short s = 20; // 2 bytes
		long l = 30; // 8 bytes
		double m = 40.5; // 8 bytes
		float f = 3.5f; // 4 bytes
		boolean b = true; // 1 byte
		char c = 'F'; // based on UNICODE, 2 bytes for Java
		
		// Category 2: Reference variables for object of a class, 
		// Always 8 bytes, used to store the memory address of an object
		String name = "John"; 
//		String name2 = name;
		name = "Joe";
		System.out.println(name);
		System.out.println(name);
		
	}

}
