package practiceProblems.graph;

import java.util.*;

class CycleInUndirected
{
    private int numberOFVertices;

    // Adjacency List Represntation
    private LinkedList<Integer> adj[];

    public CycleInUndirected (int numberOFVertices) {
        this.numberOFVertices = numberOFVertices;
        adj = new LinkedList[numberOFVertices];
        for(int i = 0; i< numberOFVertices; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    boolean isCyclic()
    {
        boolean visited[] = new boolean[numberOFVertices];

        for (int i = 0; i < numberOFVertices; i++)
            visited[i] = false;

        for(int i = 0; i < numberOFVertices; i++) {
            if (!visited[i])
                return isCycleUtil(i, visited, -1);
        }
        return false;

    }

    boolean isCycleUtil(int vertex, boolean visited[], int parent)
    {
        for(int v: adj[vertex]) {
            if(!visited[v])
            {
                visited[v] = true;
                return isCycleUtil(v, visited, vertex);
            }
            else if(v != parent)
                return true;
        }

        return false;
    }

    public static void main(String args[])
    {
        CycleInUndirected g1 = new CycleInUndirected(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);

        if (g1.isCyclic())
            System.out.println("Graph_Practice contains cycle");
        else
            System.out.println("Graph_Practice doesn't contains cycle");

        CycleInUndirected g2 = new CycleInUndirected(3);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);

        if (g2.isCyclic())
            System.out.println("Graph_Practice contains cycle");
        else
            System.out.println("Graph_Practice doesn't contains cycle");
    }
}