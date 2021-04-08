package p1;

public class Tree {
	private Node root;
	
//	public Tree() {
//		root = null;
//	}
	
	public void insert(int iData, double dData) {
		Node newNode = new Node();
		newNode.iData = iData;
		newNode.dData = dData;
		
		if(root == null) { // empty tree
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			while(true) {
				parent = current;
				if(iData < current.iData) { // go left
					current = current.leftChild;
					if(current == null) { // reach the end of the line
						parent.leftChild = newNode; // insert newNode
						return;
					}
				} else { // go right
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode; // insert newNode
						return;
					}
				}
			}
		}
	}
	
	public Node find(int key) {
		return null;
	}
	
	public Node minimum() {
		Node current;
		Node last = null;
		current = root;
		while(current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}
	
	public Node maximum() {
		Node current;
		Node last = null;
		current = root;
		while(current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}
}
