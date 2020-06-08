package trees;

public class HeightOfTree {
	
	public static void main(String[] args)
	{
		Node node = new Node(10);
		node.left = new Node(20);
		node.right = new Node(30);
		node.left.left = new Node(40);
		node.left.right = new Node(50);
		node.left.left.left = new Node(60);
		System.out.println(findHeight(node));
	}
	
	public static int findHeight(Node node)
	{
		if(node==null)
			return 0;
		return Math.max(findHeight(node.left)+1, findHeight(node.right)+1);
	}

}
