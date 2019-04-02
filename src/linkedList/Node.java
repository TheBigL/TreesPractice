package linkedList;

public class Node
{
    public Node left;
    public Node right;
    public int data;

    public Node(int data)
    {
        this.data = data;
    }

    public void insert(int value)
    {
        if(value <= data)
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
        if (value == data)
        {
            System.out.println("Node has been found!");
            return true;

        }
        else if (value <= data)
        {
            if (left == null)
            {
                System.out.println("Failed to find a Node with the value of " + value + "!");
                return false;
            }
            else {
                return left.contains(value);
            }
        }
        else
            {
            if (right == null)
            {
                System.out.println("Failed to find a Node with the value of " + value + "!");
                return false;
            } else {
                return right.contains(value);
            }
        }

    }

    public void printInOrder()
    {
        if(left != null)
        {
            left.printInOrder();
        }
        System.out.println(data);
        if(right != null)
        {
            right.printInOrder();
        }
    }


}
