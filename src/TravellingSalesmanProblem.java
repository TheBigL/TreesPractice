import graphs.Vertex;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class TravellingSalesmanProblem
{
    int n;
    private ArrayList<Vertex> vertices;
    private double[][] adjacencyMatrix;
    private DecimalFormat df = new DecimalFormat();

    public Graph(int _n, long seed )
    {
        int n = _n;

        vertices = new ArrayList<Vertex>();
        adjacencyMatrix = new double[n][n];

        // use seed to create random number generator
        Random xGenerator = new Random(seed);
        Random yGenerator = new Random(2 * seed);

    }



}
