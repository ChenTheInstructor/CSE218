package p1;

public class Demo {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(100, 100.1);
		tree.insert(50, 50.5);
		tree.insert(25, 25.2);
		tree.insert(75, 75.7);
		tree.insert(150, 150.1);
		tree.insert(120, 120.1);
		tree.insert(200, 200.1);
		tree.maximum().displayNode();
		tree.minimum().displayNode();
	}

}
