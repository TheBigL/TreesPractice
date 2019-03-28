public class Node
{
    private Node left, right;
    private int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value)
    {
        if(value < data)
        {
            if(left == null)
            {
                left = new Node(value);
            }

            else
            {
                left.insert(value);
            }
        }

        else
        {
            if(right == null)
            {
                right = new Node(value);
            }

            else
            {
                right.insert(value);
            }
        }

    }

    public boolean contains(int value)
    {
        if(value == data)
        {
            return true;
        }

        else if( value < data)
        {
            if (left == null)
            {
                return false;
            }

            else
            {
                return left.contains(value);
            }

        }

        else
        {
            if(right == null)
            {
                return false;
            }

            else
            {
                return right.contains(value);
            }
        }
    }


    public Node remove(Node root, int value)
    {
        if(root == null)
        {
            return root;
        }

        if(value < root.data)
        {
            root.left = remove(root.left, value);
        }

        else if(value > root.data)
        {
            root.right = remove(root.right, value);
        }

        else
        {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);


            root.right = remove(root.right, root.data);

        }

        return root;

    }

    private int minValue(Node node) {
        int minvalue = node.data;
        while (node.left != null)
        {
            minvalue = node.left.data;
            node = node.left;
        }
        return minvalue;
    }
}
