package p1_apps;

public class Hanoi {
	private int numDiscs;
	
	public Hanoi(int numDiscs) {
		this.numDiscs = numDiscs;
		moveDiscs(numDiscs, 1, 3, 2);
	}

	private void moveDiscs(int numDiscs, int fromPeg, int toPeg, int tempPeg) {
		if(numDiscs > 0) {
			moveDiscs(numDiscs - 1, fromPeg, tempPeg, toPeg);
			System.out.println("Move a disc from peg " + fromPeg  
					+  " to peg " + toPeg);
			moveDiscs(numDiscs - 1, tempPeg, toPeg, fromPeg);
		}
		
	}
	
	public static void main(String[] args) {
		new Hanoi(10);
	}
	
}
