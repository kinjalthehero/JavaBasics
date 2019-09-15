package practiceProblems.graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyList_Array
{
    static class Edge
    {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight)
        {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph
    {
        int vertices;
        ArrayList<Edge>[] adjacencylist;

        Graph (int vertices)
        {
            this.vertices = vertices;
            adjacencylist = new ArrayList[vertices];

            for (int i = 0; i <vertices ; i++)
            {
                adjacencylist[i] = new ArrayList<>();
            }
        }

        public void addEgde(int source, int destination, int weight)
        {
            Edge edge = new Edge(source, destination, weight);
            adjacencylist[source].add(edge);
        }

        public void printGraph(){
            for (int i = 0; i <vertices ; i++)
            {
                ArrayList<Edge> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++)
                {
                    System.out.println("vertex-" + i + " is connected to " +
                            list.get(j).destination + " with weight " +  list.get(j).weight);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int vertices = 6;
        Graph graph = new Graph(vertices);
        graph.addEgde(0, 1, 4);
        graph.addEgde(0, 2, 3);
        graph.addEgde(1, 3, 2);
        graph.addEgde(1, 2, 5);
        graph.addEgde(2, 3, 7);
        graph.addEgde(3, 4, 2);
        graph.addEgde(4, 0, 4);
        graph.addEgde(4, 1, 4);
        graph.addEgde(4, 5, 6);
        graph.printGraph();
    }
}
