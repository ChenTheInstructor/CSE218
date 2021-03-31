package p1_partitioning;

public class Demo {

	public static void main(String[] args) {
		ArrayPar arr = new ArrayPar(10);
		arr.insert(4);
		arr.insert(2);
		arr.insert(9);
		arr.insert(5);
		arr.insert(3);
		arr.insert(6);
		arr.insert(0);
		arr.insert(7);
		
		long pivot = 4;
		arr.display();
		System.out.println("The partition is located at: " + arr.partitionIt(0, arr.size()-1, pivot));
		arr.display();
	}

}
