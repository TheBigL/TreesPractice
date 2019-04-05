package search;

import java.util.HashSet;
import java.util.Set;

public class Node<T>
{
    private final T data; // The data that you want to store in this node.
    private final Set<Node> adjacentNodes = new HashSet<>();

    // Constructor
    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Set<Node> getAdjacentNodes() {
        return adjacentNodes;
    }

    public boolean addAdjacent(Node node) {
        return adjacentNodes.add(node);
    }


}
