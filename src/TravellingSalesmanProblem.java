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

        for(int i = 0; i < n; i++)
        {
            Vertex v = generateUniqueCoordinate(xGenerator, yGenerator);
        }

    }

    public Vertex generateUniqueCoordinate(Random xGenerator, Random yGenerator)
    {
        // generate a random x and y
        int x = xGenerator.nextInt(n);
        int y = yGenerator.nextInt(n);
        Vertex v = new Vertex(x, y);
        boolean isUnique = true;

        // check if x does not already exist in vertices
        if (vertices.size() > 0) {
            for (int j = 0; j < vertices.size(); j++) {
                if (vertices.get(j).x() == x) {
                    // if x already exists, start over (generate new coordinates)
                    v = generateUniqueCoordinate(xGenerator, yGenerator);
                }
            }
        }

        return v;
    }



}
