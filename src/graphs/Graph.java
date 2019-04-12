package graphs;

import java.util.*;

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

    void BFS(int v)
    {
        boolean[] visited = new boolean[v];



        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(v);

        while(queue.size() != 0)
        {
            v = queue.poll();
            System.out.print(v+" ");
            Iterator<Integer>  itr = adj[v].listIterator();
            while(itr.hasNext())
            {
                int n = itr.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void DFS(int v)
    {
        boolean[] visited = new boolean[v];

    }

    void DFSUtil(boolean[] visited, int v)
    {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> itr = adj[v].listIterator();

        while(itr.hasNext())
        {
            int n = itr.next();
            if(!visited[n])
            {
                DFSUtil(visited, n);
            }
        }
    }


}
