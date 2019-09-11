package practiceProblems.graph.dijkstra;

import java.util.*;

// Implemented using Adjacency list and priority queue
class Vertex implements Comparable<Vertex>
{
    public String name;
    public List<Edge> naighbors; // List of outgoing edge from this vertex
    public boolean visited;
    public Vertex predecessor;
    public double distance = Double.MAX_VALUE; //distance from source node

    public Vertex(String name)
    {
        this.name = name;
        this.naighbors = new ArrayList<>();
    }

    // When new element needs to be added, this condition will be compared with every element
    // othervertex = Already existing element in the queue
    // this = Element to be added
    // NOTE: This method is added in Vertex class and not in priority queue method or something
    // Note: When we use priority queue, compareTo method needs to be added for the element that needs to be added
    @Override
    public int compareTo(Vertex otherVertex) {
        System.out.println("Comparing " + this.name + " and " + otherVertex.name);
        System.out.println("Comparing " + this.distance + " " + otherVertex.distance);
        System.out.println("Comparison value " + Double.compare(this.distance, otherVertex.distance));
        System.out.println();
        return Double.compare(this.distance, otherVertex.distance);
    }
}

class Edge
{

    public double weight;
    public Vertex startVertex;
    public Vertex targetVertex;

    public Edge(double weight, Vertex startVertex, Vertex targetVertex)
    {
        this.weight = weight;
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }
}

public class DijkstraShortestPath
{

    // Send the node from where we want to find the distance to all other vertices
    public void computeShortestPaths (Vertex sourceVertex)
    {
        // Distance to itself is 0
        sourceVertex.distance  = 0;

        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);
        sourceVertex.visited  = true;

        while (!priorityQueue.isEmpty())
        {
            // Getting the minimum distance vertex from priority queue
            // Retrieves and removes the head of this queue, or returns null if this queue is empty.
            Vertex vertex = priorityQueue.poll();

            // Consider each edge from the vertex
            for(Edge edge : vertex.naighbors)
            {
                // Calculate distance and vertex at a time for each target vertex
                Vertex targetVertex = edge.targetVertex;

                if (!targetVertex.visited)
                {
                    double newDistance = vertex.distance + edge.weight;

                    if (newDistance < targetVertex.distance)
                    {
                        // remove the element if exists
                        // so that we don't add the same element in the queue
                        priorityQueue.remove(targetVertex);

                        targetVertex.distance = newDistance;
                        targetVertex.predecessor = vertex;

                        // Add in the queue. compareTo method will be called to add according to priority
                        priorityQueue.add(targetVertex);
                    }
                }
            }

            // After considering all neighboring vertices, mark vertex as visited
            vertex.visited = true;
        }
    }

    // IMPORTANT: How to find shortest path
    public List<String> getShortestPathTo(Vertex targetVertex)
    {
        List<String> path = new ArrayList<>();

        for (Vertex vertex=targetVertex; vertex != null; vertex = vertex.predecessor)
        {
            path.add(vertex.name);
        }

        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args)
    {

        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");

        Edge ac = new Edge(10,vertexA,vertexC);
        Edge ab = new Edge(17,vertexA,vertexB);
        Edge cb = new Edge(5,vertexC,vertexB);
        Edge cd = new Edge(9,vertexC,vertexD);
        Edge ce = new Edge(11,vertexC,vertexE);
        Edge bd = new Edge(1,vertexB,vertexD);
        Edge de = new Edge(6,vertexD,vertexE);

        vertexA.naighbors.add(ac);
        vertexA.naighbors.add(ab);
        vertexC.naighbors.add(cb);
        vertexC.naighbors.add(cd);
        vertexC.naighbors.add(ce);
        vertexB.naighbors.add(bd);
        vertexD.naighbors.add(de);

        DijkstraShortestPath shortestPath = new DijkstraShortestPath();
        shortestPath.computeShortestPaths(vertexA);

        System.out.println("======================================");
        System.out.println("Calculating minimum distance");
        System.out.println("======================================");

        System.out.println("Minimum distance from A to B: " + vertexB.distance);
        System.out.println("Minimum distance from A to C: " + vertexC.distance);
        System.out.println("Minimum distance from A to D: " + vertexD.distance);
        System.out.println("Minimum distance from A to E: " + vertexE.distance);

        System.out.println("=====================	=================");
        System.out.println("Calculating Paths");
        System.out.println("======================================");

        System.out.println("Shortest Path from A to B: " + shortestPath.getShortestPathTo(vertexB));
        System.out.println("Shortest Path from A to C: " + shortestPath.getShortestPathTo(vertexC));
        System.out.println("Shortest Path from A to D: " + shortestPath.getShortestPathTo(vertexD));
        System.out.println("Shortest Path from A to E: " + shortestPath.getShortestPathTo(vertexE));

    }

}