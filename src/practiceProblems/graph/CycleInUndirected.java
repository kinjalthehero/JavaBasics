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

    Boolean isCyclic()
    {

        Boolean visited[] = new Boolean[numberOFVertices];

        for (int i = 0; i < numberOFVertices; i++)
            visited[i] = false;

        // Call isCyclicUtil method for every vertex
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

    Boolean isCyclicUtil(int currVertex, Boolean visited[], int parent)
    {
        visited[currVertex] = true;

        Iterator<Integer> neighbors = adj[currVertex].iterator();

        while (neighbors.hasNext())
        {
            int currNeighbor = neighbors.next();

            //if currNeighbor is not its direct parent
            if(currNeighbor != parent)
            {
                if(visited[currNeighbor])
                    return true; // visited means cycle has been detected
                else
                    if (isCyclicUtil(currNeighbor, visited, currVertex)) //recursion from destination node
                        return true;
            }
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