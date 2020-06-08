/**
 * Print the nodes at given level 'k' considering root's level as 0
 */

package trees;

public class NodesWithDistance {

	public static void main(String[] args) {
		Node node = new Node(10);
		node.left = new Node(20);
		node.right = new Node(30);
		node.left.left = new Node(40);
		node.left.right = new Node(50);
		node.right.left = new Node(60);
		node.right.right = new Node(70);
		node.left.left.left = new Node(80);
		printNodes(node,2);

	}
	
	public static void printNodes(Node root, int k)
	{
		if(root == null)
			return;
		if(k==0)
			System.out.print(root.data+" ");
		else
		{
			printNodes(root.left, k-1);
			printNodes(root.right, k-1);
		}
	}

}
