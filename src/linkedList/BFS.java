package linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BFS
{

    static void traversal(Node node)
    {
        Queue<Node> q = new LinkedList<>();

        q.add(node);

        while(!q.isEmpty())
        {
            node = q.remove();

            System.out.println(node.data + " ");
        }

    }
}
