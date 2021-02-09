package p2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {

	public static void main(String[] args) {
		final int NUMBER_OF_DATA_ITEMS = 10000;
		int[] numbers = new int[NUMBER_OF_DATA_ITEMS];
		
		for(int i = 0; i < NUMBER_OF_DATA_ITEMS; i++) {
			numbers[i] = (int) (Math.random() * 101);
		}
		long start = System.nanoTime();
		int index = sequentialSearch(numbers, (int) (Math.random() * 101));
		long end = System.nanoTime();
		long timeTook = end - start;
		System.out.println(index + ". It took " + timeTook + " nanoseconds.");
		try {
			FileWriter fw = new FileWriter("sequentialSearchResults.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.print(timeTook + "\t");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int sequentialSearch(int[] numbers, int n) {
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == n) {
				return i;
			} 
		}
		return -1;
	}

}
