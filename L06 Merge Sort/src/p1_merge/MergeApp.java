package p1_merge;

public class MergeApp {

	public static void main(String[] args) {
		int[] arrayA = {12};
		int[] arrayB = {1, 3, 7, 18, 34, 68};
		
		int[] arrayC = new int[arrayA.length + arrayB.length];
		
		merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		display(arrayC, arrayC.length);
		
	}

	private static void display(int[] arrayC, int size) {
		for(int i = 0; i < size; i++) {
			System.out.print(arrayC[i] + " ");
		}
		System.out.println();
	}

	private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		int indexA = 0;
		int indexB = 0;
		int indexC = 0;
		
		while(indexA < sizeA && indexB < sizeB) { //neither array is finished
			if(arrayA[indexA] < arrayB[indexB]) {
				arrayC[indexC++] = arrayA[indexA++];
			} else {
				arrayC[indexC++] = arrayB[indexB++];
			}
		}
		
		while(indexA < sizeA) { // arrayB is finished
			arrayC[indexC++] = arrayA[indexA++];
		}
		
		while(indexB < sizeB) { // arrayA is finished
			arrayC[indexC++] = arrayB[indexB++];
		}
	}
	
	

}
