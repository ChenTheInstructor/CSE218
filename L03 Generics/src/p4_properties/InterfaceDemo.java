package p4_properties;

public class InterfaceDemo {

	public static void main(String[] args) {
//		MyInterface inter1 = new MyInterface() {
//
////			@Override
////			public double add(double n1, double n2) {
////				return n1 + n2;
////			}
//
//			@Override
//			public double subtract(double n1, double n2) {
//				return n1 - n2;
//			}
//			
//		};
//		
//		System.out.println(inter1.divide(10, 2));
////		System.out.println(inter1.add(5, 10));
//		System.out.println(inter1.subtract(10, 5));
		
		MyInterface inter2 = (x, y) -> x - y;
		System.out.println(inter2.subtract(10, 2));
	}

}
