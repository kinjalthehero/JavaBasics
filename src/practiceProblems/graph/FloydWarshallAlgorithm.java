package practiceProblems.graph;

import java.lang.*;

public class FloydWarshallAlgorithm
{
    final static int INF = 99999, vertices = 4;

    // https://www.youtube.com/watch?v=oNI0rf2P9gE
    void floydWarshall(int graph[][])
    {
        int distance[][] = new int[vertices][vertices];

        for (int i = 0; i < vertices; i++)
            for (int j = 0; j < vertices; j++)
                distance[i][j] = graph[i][j];

        for (int via = 0; via < vertices; via++) {
            for (int source = 0; source < vertices; source++) {
                for (int dest = 0; dest < vertices; dest++) {
                    if (distance[source][via] + distance[via][dest] < distance[source][dest])
                        distance[source][dest] = distance[source][via] + distance[via][dest];
                }
            }
        }

        // Print the shortest distance matrix
        printSolution(distance);
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



