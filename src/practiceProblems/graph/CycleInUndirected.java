package practiceProblems.graph;

import java.util.*;

class CycleInUndirected
{
    private int numberOFVertices;

    // Adjacency List Represntation
    private LinkedList<Integer> adj[];

    CycleInUndirected (int numberOFVertices) {
        this.numberOFVertices = numberOFVertices;
        adj = new LinkedList[numberOFVertices];
        for(int i = 0; i< numberOFVertices; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    Boolean isCyclic()
    {

        Boolean visited[] = new Boolean[numberOFVertices];

        // Mark all the vertices as not visited and not part of stack
        for (int i = 0; i < numberOFVertices; i++)
            visited[i] = false;

        for (int i = 0; i < numberOFVertices; i++)
        {
            if (!visited[i])
            {
                if (isCyclicUtil(i, visited, -1))
                    return true;
            }
        }

        return false;
    }

    Boolean isCyclicUtil(int vertex, Boolean visited[], int parent)
    {
        visited[vertex] = true;
        Integer i;

        Iterator<Integer> neighbors = adj[vertex].iterator();

        while (neighbors.hasNext())
        {
            i = neighbors.next();

            if (!visited[i])
            {
                if (isCyclicUtil(i, visited, vertex))
                    return true;
            }

            // If an adjacent is visited and not parent of current vertex, then there is a cycle
            else if (i != parent)
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
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");

        CycleInUndirected g2 = new CycleInUndirected(3);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);

        if (g2.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");
    }
}