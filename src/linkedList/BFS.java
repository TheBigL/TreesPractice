package linkedList;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
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

    public  void BSTSequnces(Node root, List<Integer> curList)
    {
        if (root == null) return;
        curList.add(root.data);
        if (root.left != null) curList.add(root.left.data);
        if (root.right != null) curList.add(root.right.data);
        BSTSequnces(root.left, curList);
        BSTSequnces(root.right, curList);
        if (root.right != null) curList.add(root.right.data);
        if (root.left != null) curList.add(root.left.data);
        BSTSequnces(root.right, curList);
        BSTSequnces(root.left, curList);
    }


}
