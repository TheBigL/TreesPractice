package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    public int getHeight(Node node)
    {
        if(node == null)
        {
            return 0;
        }

        else
        {
            int lHeight = getHeight(node.left);
            int rHeight = getHeight(node.right);

            if(lHeight > rHeight)
            {
                System.out.println("The Tree's height is: " + (lHeight + 1));
                return lHeight + 1;
            }

            else
            {
                System.out.println("The Tree's height is: " + (rHeight + 1));
                return rHeight + 1;
            }
        }
    }

    public boolean isBalanced(Node root)
    {
        int lh, rh;

        if(root == null)
        {
            return true;
        }

        lh = getHeight(root.left);
        rh = getHeight(root.right);

        if(Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right))
        {
            return true;
        }

        return false;
    }



    public void printInOrderIterative(Node node)
    {

        if(node == null)
        {
            return;
        }

        LinkedList<Node> q = new LinkedList();

        q.add(node);

        while(!q.isEmpty())
        {
            Node currentNode = q.poll();
            System.out.print(currentNode.data + " ");
            if(currentNode.left != null)
            {
                q.add(currentNode.left);
            }


            if(currentNode.right != null)
            {
                q.add(currentNode.right);
            }

        }

    }


    public LinkedList<Node> printInOrderRecursive(Node node, LinkedList<Node> q) {
        if (node == null) {
            return q;
        }

        q.add(node);

        while (!q.isEmpty()) {
            if (node.left != null) {
                q.add(node.left);
            }

            if (node.right != null) {
                q.add(node.right);
            }
        }


        return q;
    }

    public int getCommonAncestor(Node root, int n1, int n2)
    {
        List<Integer> path1 = new ArrayList<>();
        List<Integer> path2 = new ArrayList<>();
        if(!covers(root, n1, path1) || !covers(root, n2, path2))
        {
            return -1;

        }

        int i;

        for(i = 0; i < path1.size() && i < path2.size(); i++)
        {
            if (!path1.get(i).equals(path2.get(i)))
                break;
        }

        return path1.get(i-1);


    }

    public boolean covers(Node root, int n, List<Integer> path)
    {
        if(root == null)
        {
            return false;
        }

        path.add(root.data);

        if(root.data == n)
        {
            return true;
        }

        if (root.left != null && covers(root.left, n, path))
        {
            return true;
        }

        if (root.right != null && covers(root.right, n, path)) {
            return true;
        }

        path.remove(path.size()-1);

        return false;
    }




}
