package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LeftView {

	public static void main(String[] args) {
		Node node = new Node(10);
		node.left = new Node(20);
		node.right = new Node(30);
		node.right.left = new Node(60);
		node.right.right = new Node(70);
		node.right.left.right = new Node(80);
		leftView(node);

	}
	
	public static void leftView(Node node)
	{
		if(node==null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		System.out.print(node.data+" ");
		q.add(null);
		while(!q.isEmpty())
		{
			Node tempNode = q.poll();
			if(tempNode!=null)
			{
				if(tempNode.left!=null)
					q.add(tempNode.left);
				if(tempNode.right!=null)
					q.add(tempNode.right);
			}
			else if(!q.isEmpty())
			{
				q.add(null);
				System.out.print(q.peek().data+" ");
			}
			
		}
	}

}
