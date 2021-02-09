package p3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		for (int round = 1; round < 50; round = round+5) {
			int NUMBER_OF_DATA_ITEMS = 10000*round;
			int[] numbers = new int[NUMBER_OF_DATA_ITEMS];
			for (int i = 0; i < NUMBER_OF_DATA_ITEMS; i++) {
				numbers[i] = (int) (Math.random() * 1000000001);
			}
			//		System.out.println(Arrays.toString(numbers));
			Arrays.sort(numbers);
			//		System.out.println(Arrays.toString(numbers));
			long timeTook = 0;
			for (int i = 0; i < 50; i++) {
				long t = sequentialSearch(numbers, -1);
				System.out.println("Round:  " + round +  ", each search took: "  + t);
				timeTook += t;
			}
			try {
				FileWriter fw = new FileWriter("binarySearchResults.txt", true);
				PrintWriter pw = new PrintWriter(fw);
				pw.print(timeTook / 50 + "\t");
				pw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Round " + round + ": It took " + (timeTook / 50) + " nanoseconds.");
		}
	}
	
	public static long binarySearch(int[] numbers, int key) {
		int i = 0;
		long start = System.nanoTime();
		int low = 0;
		int high = numbers.length -1;
		
		while (high >= low) {
			int mid = (low + high)/2;
			i++;
			if(key < numbers[mid]) {
				high = mid -1;
			} else if (key == numbers[mid]) {
				long end = System.nanoTime();
				return (end - start);
			} else {
				low = mid + 1;
			}
		}
		long end = System.nanoTime();
		System.out.println("Comparisions: " + i);
		return (end-start);
	}
	
	public static long sequentialSearch(int[] numbers, int n) {
		long start = System.nanoTime();
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == n) {
				long end = System.nanoTime();
				return (end-start);
			} 
		}
		long end = System.nanoTime();
		return end - start;
	}

}
