package p4_properties;

public class InterfaceDemo2 {

	public static void main(String[] args) {
		double result = MyInterface.multiply(2.0, 5.0);
		System.out.println(result);
		
		MyClass class1 = new MyClass();
		System.out.println(class1.divide(10.0, 2.0));
	}

}
