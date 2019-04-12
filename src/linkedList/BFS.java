package linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BFS
{

    public void traversal(Node node)
    {
        System.out.println("Depth First Search: \n");
        Queue<Node> q = new LinkedList<>();

        q.add(node);

        while(!q.isEmpty())
        {
            node = q.remove();

            System.out.println(node.data + " \n");

            if(node.left != null)
            {
                q.add(node.left);
            }

            if(node.right != null)
            {
                q.add(node.right);
            }
        }

    }
}