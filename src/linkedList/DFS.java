package linkedList;

public class DFS
{


    //Goes through the TRee via Recursion
    public void traversal(Node node)
    {
        if(node == null)
        {
            return;
        }

        else
        {

            System.out.println(node.data + " \n");
            traversal(node.left);
            traversal(node.right);
        }


    }

}
