package trees;

public class DepthFirstTraversal {

	public static void main(String[] args) {
		Node node = new Node(10);
		node.left = new Node(20);
		node.right = new Node(30);
		node.left.left = new Node(40);
		System.out.print("INORDER: ");
		inOrder(node);
		System.out.println();
		System.out.print("PREORDER: ");
		preOrder(node);
		System.out.println();
		System.out.print("POSTORDER: ");
		postOrder(node);

	}
	
	public static void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	public static void preOrder(Node root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public static void postOrder(Node root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}

}
