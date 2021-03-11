package p1_merge;

public class MergeApp {

	public static void main(String[] args) {
		int[] arrayA = {12, 34, 56, 61, 78};
		int[] arrayB = {1, 3, 7, 19, 34, 68};
		int[] arrayC = new int[arrayA.length + arrayB.length];
		
		merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		display(arrayC, arrayC.length);
	}
	
	public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		
		while(aIndex < sizeA && bIndex < sizeB) { //neither arrayA nor arrayB done
			if(arrayA[aIndex] < arrayB[bIndex]) {
				arrayC[cIndex++] = arrayA[aIndex++];
//				aIndex++;
//				cIndex++;
			} else {
				arrayC[cIndex++] = arrayB[bIndex++];
			}
		}
		
		while(aIndex < sizeA) { // arrayB is done
			arrayC[cIndex++] = arrayA[aIndex++];
		}
		
		while(bIndex < sizeB) { // arrayA is done
			arrayC[cIndex++] = arrayB[bIndex++];
		}
	}
	
	public static void display(int[] arr, int size) {
		for(int i  =0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
