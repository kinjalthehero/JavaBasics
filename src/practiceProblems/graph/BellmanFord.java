package practiceProblems.graph;

/**
 * Bellman-Ford algorithm.
 * The algorithm finds the shortest path between a starting node and all other nodes in the graph.
 * The algorithm also detects negative cycles.
*/

import java.util.*;

public class BellmanFord
{
    public static class Edge
    {
        double cost;
        int from, to;

        public Edge(int from, int to, double cost)
        {
            this.to = to;
            this.from = from;
            this.cost = cost;
        }
    }

    // Graph_Practice with adjacency list
    public static List<Edge>[] createGraph (int numberOfVertices)
    {
        List<Edge>[] graph = new List[numberOfVertices];

        for (int i = 0; i < numberOfVertices; i++)
        {
            graph[i] = new ArrayList<>();
        }

        return graph;
    }

     // The algorithm also detects negative cycles.
     //  If a node is part of a negative cycle then the minimum cost for that node is set to Double.NEGATIVE_INFINITY.
    public static double[] bellmanFord(List<Edge>[] graph, int numberOfVertices, int sourceNode) {

        // Initialize the distance to all nodes to be infinity except for the start node which is zero.
        double[] dist = new double[numberOfVertices];
        Arrays.fill(dist, Double.POSITIVE_INFINITY);
        dist[sourceNode] = 0;

        // For each vertex, apply relaxation for all the edges
        for (int i = 0; i < numberOfVertices - 1; i++)
            for (List<Edge> edges : graph)
                for (Edge edge : edges)
                    if (dist[edge.from] + edge.cost < dist[edge.to])
                        dist[edge.to] = dist[edge.from] + edge.cost;

        // Run algorithm a second time to detect which nodes are part of a negative cycle.
        // A negative cycle has occurred if we can find a better path beyond the optimal solution.
        for (int i = 0; i < numberOfVertices - 1; i++)
            for (List<Edge> edges : graph)
                for (Edge edge : edges)
                    if (dist[edge.from] + edge.cost < dist[edge.to])
                        dist[edge.to] = Double.NEGATIVE_INFINITY;

        // Return the array containing the shortest distance to every node
        return dist;
    }

    public static void main(String[] args) {

        int numberOfVertices = 9, sourceNode = 0;
        List<Edge>[] graph = createGraph(numberOfVertices);

        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[4].add(new Edge(4, 3, -3));
        graph[3].add(new Edge(3, 2, 1));
        graph[1].add(new Edge(1, 5, 4));
        graph[1].add(new Edge(1, 6, 4));
        graph[5].add(new Edge(5, 6, 5));
        graph[6].add(new Edge(6, 7, 4));
        graph[5].add(new Edge(5, 7, 3));

        double[] d = bellmanFord(graph, numberOfVertices, sourceNode);

        for (int i = 0; i < numberOfVertices; i++)
            System.out.printf("The cost to get from node %d to %d is %.2f\n", sourceNode, i, d[i]);
    }
}