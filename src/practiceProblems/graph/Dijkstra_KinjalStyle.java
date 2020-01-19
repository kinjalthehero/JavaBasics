package practiceProblems.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

class Dijkstra_KinjalStyle {

    static class Vertex implements Comparable<Dijkstra_KinjalStyle.Vertex> {

        String name;
        List<Edge> adjList;
        boolean visited;
        int distance;

        public Vertex (String name) {
            this.name = name;
            adjList = new LinkedList<>();
            visited = false;
            distance = Integer.MAX_VALUE;
        }

        // When new element needs to be added, this condition will be compared with every element
        // othervertex = Already existing element in the queue
        // this = Element to be added
        // NOTE: This method is added in Vertex class and not in priority queue method or something
        // Note: When we use priority queue, compareTo method needs to be added for the element that needs to be added
        @Override
        public int compareTo(Dijkstra_KinjalStyle.Vertex otherVertex) {
            return Double.compare(this.distance, otherVertex.distance);
        }
    }

    static class Edge {

        Vertex sourceVertex;
        Vertex destVertex;
        int weight;

        Edge (Vertex sourceVertex, Vertex destVertex, int weight) {

            this.sourceVertex = sourceVertex;
            this.destVertex = destVertex;
            this.weight = weight;
        }
    }

    public void dijkstra (Vertex sourceVertex) {

        sourceVertex.distance = 0;
        PriorityQueue<Vertex> queue = new PriorityQueue<>();
        queue.add(sourceVertex);

        while (!queue.isEmpty()) {

            Vertex node = queue.poll();

            for (Edge edge: node.adjList) {

                if (!edge.destVertex.visited && edge.destVertex != null) {

                    queue.add(edge.destVertex);

                    if (edge.sourceVertex.distance + edge.weight < edge.destVertex.distance)
                        edge.destVertex.distance = edge.sourceVertex.distance + edge.weight;
                }
            }

            node.visited = true;
        }

    }

    public static void main (String[] args) {

        Dijkstra_KinjalStyle graph = new Dijkstra_KinjalStyle();
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");

        Edge ab = new Edge(vertexA, vertexB, 17);
        Edge ac = new Edge(vertexA, vertexC, 10);
        Edge bd = new Edge(vertexB, vertexD, 1);
        Edge cd = new Edge(vertexC, vertexD, 9);
        Edge cb = new Edge(vertexC, vertexB, 5);
        Edge ce = new Edge(vertexC, vertexE, 11);
        Edge de = new Edge(vertexD, vertexE, 6);

        vertexA.adjList.add(ab);
        vertexA.adjList.add(ac);
        vertexB.adjList.add(bd);
        vertexC.adjList.add(cd);
        vertexC.adjList.add(cb);
        vertexC.adjList.add(ce);
        vertexD.adjList.add(de);

        graph.dijkstra(vertexA);

        System.out.println(vertexA.name + ": " + vertexA.distance);
        System.out.println(vertexB.name + ": " + vertexB.distance);
        System.out.println(vertexC.name + ": " + vertexC.distance);
        System.out.println(vertexD.name + ": " + vertexD.distance);
        System.out.println(vertexE.name + ": " + vertexE.distance);

        }

    }