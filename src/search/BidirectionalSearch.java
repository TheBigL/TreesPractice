package search;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BidirectionalSearch
{
    public boolean pathExists(Node a, Node b)
    {
        Queue<Node> queueA = new LinkedList<>();

        Queue<Node> queueB = new LinkedList<>();

        Set<Node> visitedA = new HashSet<>();

        Set<Node> visitedB = new HashSet<>();

        visitedA.add(a);
        visitedB.add(b);

        queueA.add(a);
        queueB.add(b);

        if(pathExistsHelper(queueA, visitedA, visitedB))
        {
            return true;
        }

        else if(pathExistsHelper(queueB, visitedB, visitedA))
        {
            return true;
        }

        return false;




    }

    private boolean pathExistsHelper(Queue<Node> queue, Set<Node> sideA, Set<Node> sideB)
    {
        if(!queue.isEmpty())
        {
            Node next = queue.remove();

            Set<Node> adjecentNodes = next.getAdjacentNodes();

            for(Node node : adjecentNodes)
            {
                if(sideA.contains(node))
                {
                    return true;
                }

                else if(sideB.contains(node))
                {
                    queue.add(node);
                }
            }
        }

        return false;

    }

    public static void main(String[] args)
    {
        Node nodeOne = new Node(1);
        Node nodeTwo = new Node(2);
        Node nodeThree = new Node(3);
        Node nodeFour = new Node(4);
        Node nodeTen = new Node(10);

    }
}
