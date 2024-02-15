package p2_functional_programming;

public class Demo {

	public static void main(String[] args) {
//		Computable add = new Computable() {
//
//			@Override
//			public double compute(double n1, double n2) {
//				return n1 + n2;
//			}
//			
//		};
//		
//		Computable subtract = new Computable() {
//
//			@Override
//			public double compute(double n1, double n2) {
//				return n1 - n2;
//			}
//			
//		};
		
		Computable add = (x, y) -> x + y;
		Computable subtract = (x, y) -> x - y;
		
//		Computable c1 = new Computable() {
//
//			@Override
//			public double compute(double n1, double n2) {
//				// TODO Auto-generated method stub
//				return n1 + n2;
//			}
//
//			@Override
//			public double compute2(double n1, double n2) {
//				// TODO Auto-generated method stub
//				return n1 - n2;
//			}
//			
//		};
		
		double sum = add.compute(10.5, 20.5);
		double diff = subtract.compute(10.5, 20.5);
		System.out.println(sum);
		System.out.println(diff);
	}

}
