import linkedList.BFS;
import linkedList.DFS;
import linkedList.Node;

class Main
{
    public static void main(String[] args)
    {

        Node node = new Node(10);
        node.insert(4);
        node.insert(2);
        node.insert(3);
        node.insert(14);
        node.insert(9);
        node.insert(1);
        node.insert(10);
        node.insert(8);
        node.insert(15);
        node.insert(16);
        node.insert(12);
        node.insert(11);




        BFS bfs = new BFS();
        DFS dfs = new DFS();

        dfs.traversal(node);
        bfs.traversal(node);

        node.printInOrder();
        node.contains(5);


    }
}