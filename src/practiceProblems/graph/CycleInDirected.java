package practiceProblems.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class CycleInDirected {

    private final int numberOFVertices;
    private final List<List<Integer>> adj;

    public CycleInDirected(int numberOFVertices)
    {
        this.numberOFVertices = numberOFVertices;

        adj = new ArrayList<>(numberOFVertices);

        for (int i = 0; i < numberOFVertices; i++)
            adj.add(new LinkedList<>());
    }

    private boolean isCyclic()
    {
        boolean[] visited = new boolean[numberOFVertices];
        boolean[] recStack = new boolean[numberOFVertices];

        for (int i = 0; i < numberOFVertices; i++)
        {
            if (isCyclicUtil(i, visited, recStack))
                return true;
        }

        return false;
    }

    private boolean isCyclicUtil(int currVertex, boolean[] visited, boolean[] recStack)
    {
        if (recStack[currVertex])
            return true;

        if (visited[currVertex])
            return false;

        visited[currVertex] = true;
        recStack[currVertex] = true;

        List<Integer> neighbors = adj.get(currVertex);

        for (Integer naighbor: neighbors)
            if (isCyclicUtil(naighbor, visited, recStack))
                return true;

        recStack[currVertex] = false;

        return false;
    }

    private void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }

    public static void main(String[] args)
    {
        CycleInDirected graph = new CycleInDirected(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        if(graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
    }
}