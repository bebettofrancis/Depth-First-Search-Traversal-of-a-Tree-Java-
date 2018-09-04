//program to implement DFS

class Node {
	int key;
	Node left,right;
	
	Node (int item) {
		key = item;
		left = right = null;
	}
}

class DFS {
	Node root;
	
	DFS() {
		root = null;
	}
	
	//for postorder
	void printPostorder(Node node) {
		if(node==null)
			return;
		
		printPostorder(node.left);
		
		printPostorder(node.right);
		
		System.out.print(node.key+" ");
	}
	
	//for inorder
	void printInorder(Node node) {
		if(node==null)
			return;
		
		printInorder(node.left);
		
		System.out.print(node.key+" ");
		
		printInorder(node.right);
	}
	
	//for preorder
	void printPreorder (Node node) {
		if(node==null)
			return;
		
		System.out.print(node.key+" ");
		
		printPreorder(node.left);
		
		printPreorder(node.right);
	}
	
	
	//wrapper classes
	void printPostorder() {
		printPostorder(root);
	}
	
	void printInorder() {
		printInorder(root);
	}
	
	void printPreorder() {
		printPreorder(root);
	}
	
	public static void main(String args[]) {
		DFS tree = new DFS();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Preorder traversal of binary tree: ");
		tree.printPreorder();
		
		System.out.println("\nInorder traversal of binary tree is: ");
		tree.printInorder();
		
		System.out.println("\nPostorder traversal of binary tree is: ");
		tree.printPostorder();
	}
}
		
		
		
	