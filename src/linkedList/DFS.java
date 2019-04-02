package linkedList;

public class DFS
{


    public void traversal(Node node)
    {
        if(node == null)
        {
            return;
        }

        else
        {
            System.out.println(node.data + " ");
            traversal(node.left);
            traversal(node.right);
        }


    }

}
