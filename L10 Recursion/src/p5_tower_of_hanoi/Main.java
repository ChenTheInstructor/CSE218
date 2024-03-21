package p5_tower_of_hanoi;

public class Main {

	public static void main(String[] args) {
		int numDiscs = 10;
		moveDiscs(numDiscs, 1, 3, 2);
	}

	private static void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
		if(num > 0) {
			moveDiscs(num -1, fromPeg, tempPeg, toPeg);
			System.out.println("Move a disc from peg " + fromPeg + " to peg " + toPeg);
			
			moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
		}
	}

}
