package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BfsLineByLine {

	public static void main(String[] args) {
		Node node = new Node(10);
		node.left = new Node(20);
		node.right = new Node(30);
		node.left.left = new Node(40);
		node.left.right = new Node(50);
		node.left.left.left = new Node(60);
		bfsLineByLine(node);

	}
	
	public static void bfsLineByLine(Node node)
	{
		if(node==null)
			return;
		
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		q.add(null);
		while(!q.isEmpty())
		{
			Node printNode = q.poll();
			if(printNode!=null)
			{
				System.out.print(printNode.data+" ");
				if(printNode.left!=null)
					q.add(printNode.left);
				if(printNode.right!=null)
					q.add(printNode.right);
			}
			else
			{
				if(!q.isEmpty())
					q.add(null);
				System.out.println();
			}
		}
	}

}
