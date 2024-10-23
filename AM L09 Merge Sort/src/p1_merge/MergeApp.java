package p1_merge;

public class MergeApp {

	public static void main(String[] args) {
		int[] arrayA = { 129 };
		int[] arrayB = { 1, 3, 7, 19, 34, 68 };
		int[] arrayC = new int[arrayA.length + arrayB.length];
		merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		display(arrayC, arrayC.length);
	}

	private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		int indexA = 0;
		int indexB = 0;
		int indexC = 0;

		while (indexA < sizeA && indexB < sizeB) { // neither subarray is finished
			if (arrayA[indexA] < arrayB[indexB]) {
				arrayC[indexC++] = arrayA[indexA++];
//				indexA++;
//				indexC++;
			} else {
				arrayC[indexC++] = arrayB[indexB++];
//				indexB++;
//				indexC++;
			}
		}

		while (indexA < sizeA) { // arrayB is finished
			arrayC[indexC++] = arrayA[indexA++];
		}

		while (indexB < sizeB) { // arrayA is finished
			arrayC[indexC++] = arrayB[indexB++];
		}
	}

	private static void display(int[] arrayC, int length) {
		for (int i = 0; i < length; i++) {
			System.out.println(arrayC[i]);
		}
		System.out.println();
	}

}
