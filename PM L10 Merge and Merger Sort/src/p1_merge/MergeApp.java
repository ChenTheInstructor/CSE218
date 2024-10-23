package p1_merge;

public class MergeApp {

	public static void main(String[] args) {
		int[] arrayA = {2, 5, 9, 10, 13, 17, 21};
		int[] arrayB = {5, 9, 12, 16, 18, 21, 23, 34, 56};
		int[] arrayC = new int[arrayA.length + arrayB.length];
		merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		display(arrayC, arrayC.length);
	}
	
	public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		int indexA = 0;
		int indexB = 0;
		int indexC = 0;
		
		while(indexA < sizeA && indexB < sizeB) { // neither arrayA nor arrayB finished
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
	
	public static void display(int[] array, int size) {
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
