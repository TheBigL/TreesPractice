package graphs;

import java.util.LinkedList;

public class Graph
{
    int V; //Number of Vertices

    LinkedList<Integer>[] adj; // adjacency lists

    //Constructor
    Graph(int V)
    {
        this.V = V;
        adj = new LinkedList[V];

        for (int i = 0; i < adj.length; i++)
            adj[i] = new LinkedList<Integer>();

    }

    //To add an edge to graph
    void addEdge(int v, int w)
    {
        adj[v].add(w); // Add w to v’s list.
    }
}
