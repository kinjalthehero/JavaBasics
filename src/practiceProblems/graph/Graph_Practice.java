package practiceProblems.graph;

import java.util.*;

class Graph_Practice {

    static class Vertex {

        int name;
        boolean visited;
        List<Vertex> adjList;

        Vertex (int name) {
            this.name = name;
            this.visited = false;
            adjList = new LinkedList<>();
        }

        public void addEdge (Vertex destVertex) {
            adjList.add(destVertex);
        }
    }

    public void printNeighbors (Vertex vertex) {

        System.out.print ("Neighbor of " + vertex.name + " is ");

        for (Vertex node: vertex.adjList) {
            System.out.print(node.name + " ");
        }
    }

    public void bfs (Vertex vertex) {

        Queue<Vertex> queue = new LinkedList<>();
        queue.add(vertex);
        vertex.visited = true;

        while (!queue.isEmpty()) {

            Vertex currVertex = queue.poll();
            System.out.print(currVertex.name + " ");

            List<Vertex> list = currVertex.adjList;

            for (Vertex neighbor:list) {
                if (neighbor != null && !neighbor.visited) {
                    neighbor.visited = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public void dfs (Vertex node) {

        node.visited = true;
        System.out.print (node.name + " ");

        for (Vertex vertex: node.adjList) {

            if (!vertex.visited && vertex != null) {
                dfs (vertex);
            }
        }
    }

    public void dfs_iteration (Vertex vertex) {

        Stack<Vertex> stack = new Stack<>();
        stack.add(vertex);

        while (!stack.isEmpty()) {

            Vertex node = stack.pop();
            System.out.print(node.name + " ");
            node.visited = true;

            for (Vertex neighbor: node.adjList) {

                if (!neighbor.visited && neighbor != null) {
                    stack.add(neighbor);
                    neighbor.visited = true;
                }
            }
        }
    }


    public static void main (String[] args) {

        Graph_Practice graphPractice = new Graph_Practice();

        Vertex v40 = new Vertex(40);
        Vertex v10 = new Vertex(10);
        Vertex v20 = new Vertex(20);
        Vertex v30 = new Vertex(30);
        Vertex v50 = new Vertex(50);
        Vertex v60 = new Vertex(60);
        Vertex v70 = new Vertex(70);

        v40.addEdge(v20);
        v40.addEdge(v10);
        v20.addEdge(v50);
        v50.addEdge(v70);
        v60.addEdge(v70);
        v30.addEdge(v60);
        v10.addEdge(v30);
        v20.addEdge(v10);
        v20.addEdge(v30);
        v20.addEdge(v60);

        //graphPractice.printNeighbors(v20);
        System.out.println();
        //graphPractice.bfs(v40);
        System.out.println("DFS");
        graphPractice.dfs_iteration(v40);
    }

}