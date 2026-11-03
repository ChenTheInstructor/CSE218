package p1_merge;

public class MergeApp {

	public static void main(String[] args) {
		int[] arrayA = {2, 5, 7, 9, 34};
		int[] arrayB = {8, 20, 31, 35, 67, 89};
		int[] arrayC = new int[arrayA.length + arrayB.length];
		merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		display(arrayC, arrayC.length);
	}

	private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		int indexA = 0;
		int indexB = 0;
		int indexC = 0;
		
		while(indexA < sizeA && indexB < sizeB) {
			if(arrayA[indexA] < arrayB[indexB]) {
				arrayC[indexC++] = arrayA[indexA++];
			} else {
				arrayC[indexC++] = arrayB[indexB++];
			}
		}
		
		while(indexA < sizeA) {
			arrayC[indexC++] = arrayA[indexA++];
		}
		
		while(indexB < sizeB) {
			arrayC[indexC++] = arrayB[indexB++];
		}
	}

	private static void display(int[] arrayC, int length) {
		for(int i = 0; i < length; i++) {
			System.out.print(arrayC[i] + " ");
		}
		System.out.println();
	}

}
