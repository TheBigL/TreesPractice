import linkedList.BFS;
import linkedList.DFS;
import linkedList.Node;

class Main
{
    public static void main(String[] args)
    {
        Node node = new Node(1);
        node.insert(2);
        node.insert(3);
        node.insert(4);
        node.insert(5);

        BFS bfs = new BFS();
        DFS dfs = new DFS();

        dfs.traversal(node);
        bfs.traversal(node);


    }
}