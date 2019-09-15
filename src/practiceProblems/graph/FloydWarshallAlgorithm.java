package practiceProblems.graph;

import java.lang.*;

public class FloydWarshallAlgorithm
{
    final static int INF = 99999, vertices = 4;

    void floydWarshall(int graph[][])
    {
        int dist[][] = new int[vertices][vertices];
        int i, j, k;

        for (i = 0; i < vertices; i++)
            for (j = 0; j < vertices; j++)
                dist[i][j] = graph[i][j];

        for (k = 0; k < vertices; k++)
        {
            // Pick all vertices as source one by one
            for (i = 0; i < vertices; i++)
            {
                // Pick all vertices as destination for the above picked source
                for (j = 0; j < vertices; j++)
                {
                    // If vertex k is on the shortest pathFromSource from i to j, then update the value of distanceFromSource[i][j]
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }

        // Print the shortest distance matrix
        printSolution(dist);
    }

    void printSolution(int dist[][])
    {
        System.out.println("The following matrix shows the shortest distances between every pair of vertices");
        for (int i = 0; i< vertices; ++i)
        {
            for (int j = 0; j< vertices; ++j)
            {
                if (dist[i][j]==INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j]+"   ");
            }
            System.out.println();
        }
    }

    // Driver program to test above function
    public static void main (String[] args)
    {
        int graph[][] =
                {
                    {0,   5,  INF, 10},
                    {INF, 0,   3, INF},
                    {INF, INF, 0,   1},
                    {INF, INF, INF, 0}
                };

        FloydWarshallAlgorithm a = new FloydWarshallAlgorithm();
        a.floydWarshall(graph);
    }
}



