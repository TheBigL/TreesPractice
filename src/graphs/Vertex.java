package graphs;

import java.util.List;

public class Vertex
{
    public String name;
    public List<Edge> connections;

    private final int x;
    private final int y;
    private int number;
    private double dist;

    public Vertex(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.number = -1;
        this.dist = -1;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }
}

