package graphs;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.sort;

public class TSPGraph
{
    // n = number of nodes
    int n;
    private ArrayList<Vertex> vertices;
    private double[][] adjacencyMatrix;
    private DecimalFormat df = new DecimalFormat("0.00");

    public TSPGraph(int _n, long seed ) {
        int n = _n;

        vertices = new ArrayList<Vertex>();
        adjacencyMatrix = new double[n][n];

        // use seed to create random number generator
        Random xGenerator = new Random(seed);
        Random yGenerator = new Random(2 * seed);

        for (int i = 0; i < n; i++) {
            Vertex v = generateUniqueCoordinate(xGenerator, yGenerator);
        }

        for (int i = 0; i < n; i++) {
            Vertex v = generateUniqueCoordinate(xGenerator, yGenerator);
            v.setNumber(i);
            vertices.add(v);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjacencyMatrix[i][j] = getDist(vertices.get(i), vertices.get(j));
            }
        }
    }

    public Vertex generateUniqueCoordinate(Random xGenerator, Random yGenerator) {
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

    public double getDist(Vertex a, Vertex b) {
        double yDistance = Math.abs(b.y() - a.y());
        double xDistance = Math.abs(b.x() - a.x());
        // distance = square root of (yDistance^2 + xDistance^2)
        double distance = Math.sqrt(Math.pow(yDistance, 2) + Math.pow(xDistance, 2));
        return distance;
    }

    public ArrayList<Vertex> sortVertices(ArrayList<Vertex> toSort) {

        Vertex[] vertexArray = new Vertex[toSort.size()];
        toSort.toArray(vertexArray);
        Vertex[] emptyArray = new Vertex[toSort.size()];

        sort(vertexArray, 0, vertexArray.length);

        ArrayList<Vertex> toReturn = new ArrayList<Vertex>(Arrays.asList(vertexArray));
        return toReturn;
    }

    private static void swap(Vertex[] src, int a, int b) {
        Vertex t = src[a];
        src[a] = src[b];
        src[b] = t;
    }
}






