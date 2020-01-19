package practiceProblems.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class CycleInDirected {

    private final int numberOFVertices;
    private final List<Integer>[] adj;

    private boolean isCyclic()
    {
        boolean[] visitedArr = new boolean[numberOFVertices];

        // keep track of vertices currently in recursion stack of function for DFS traversal
        boolean[] recursiveArr = new boolean[numberOFVertices];

        for (int i = 0; i < numberOFVertices; i++)
        {
            if (isCyclicUtil(i, visitedArr, recursiveArr))
                return true;
        }

        return false;
    }

    private boolean isCyclicUtil(int currVertex, boolean[] visited, boolean[] recursiveArr)
    {
        visited[currVertex] = true;
        recursiveArr[currVertex] = true;

        for (int i = 0; i < adj[currVertex].size(); i++) {

            int neighbor = adj[currVertex].get(i);

            //if not visited then DFS recursively
            if (!visited[neighbor] && isCyclicUtil(neighbor, visited, recursiveArr))
                return true;

            // if visited and present in recursive array that means cycle is present in current call stack
            else if (recursiveArr[neighbor])
                return true;
        }

        //if reached here means cycle has not found in DFS from this vertex. Reset.
        recursiveArr[currVertex] = false;
        return false;

    }

    private void addEdge(int source, int dest) {
        adj[source].add(dest);
    }

    public CycleInDirected(int numberOFVertices)
    {
        this.numberOFVertices = numberOFVertices;

        adj = new ArrayList[numberOFVertices];

        for (int i = 0; i < numberOFVertices; i++)
            adj[i] = (new ArrayList<>());
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
            System.out.println("Graph_Practice contains cycle");
        else
            System.out.println("Graph_Practice doesn't contain cycle");
    }
}