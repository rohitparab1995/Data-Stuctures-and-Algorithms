package module.AlgoExpertPrograms;

class Node{
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}	
}

class BinarySearchTree{
	public Node root;

	public BinarySearchTree() {
		this.root = null;
	}		
	
	public void insert(Node root, int data)
	{
		Node node = new Node(data);
		Node current = root, parent = null;
		
		if(root == null) 
		{
			this.root = node;
			return;
		}
		else 
		{
			while(true)
			{
				parent = current;
				if(data < parent.data)
				{
					current = current.left;
					if(current == null)
					{
						parent.left = node;
						return;
					}
				}
				else if(data > parent.data)
				{
					current = current.right;
					if(current == null)
					{
						parent.right = node;
						return;
					}
						
				}
			}
		}
			
	}
	
	public Node delete(Node node, int data) {
		if(node == null) return null;
		else
		{
			if(node.data < data)
			{
				node.right = delete(node.right, data);
			}
			else if(node.data > data)
			{
				node.left = delete(node.left, data);
			}
			else
			{
				if(node.left == null && node.right == null)
				{
					node = null;
				}
				else if(node.left == null)
				{
					node = node.right;
				}
				else if(node.right == null)
				{
					node = node.left;
				}
				else
				{
					Node temp = minNode(node.right);
					node.data = temp.data;
					node.right = delete(temp,temp.data);
				}
			}
			return node;
		}
		
	}
	
	private Node minNode(Node node) {
		if(node.left != null)
		{
			return minNode(node.left);
		}
		else return node;
	}

	public void inorderTraversal(Node root)
	{
		if(root != null)
		{
			System.out.print(root.data + " ");
			if(root.left != null) inorderTraversal(root.left);
			if(root.right != null) inorderTraversal(root.right);
		}
	}
}

public class BSTOperations {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(bst.root, 50);
		bst.insert(bst.root, 10);
		bst.insert(bst.root, 20);
		bst.insert(bst.root, 60);
		bst.insert(bst.root, 1);
		bst.insert(bst.root, 55);
		bst.insert(bst.root, 56);
		
		bst.inorderTraversal(bst.root);

		System.out.println("deleted:" + bst.delete(bst.root,20).data);
		
		bst.inorderTraversal(bst.root);
	}

}
