package practiceProblems.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS
{
    static class Vertex
    {
        int data;
        boolean visited;
        List<Vertex> neighbours;

        Vertex(int data)
        {
            this.data=data;
            this.neighbours=new ArrayList<>();

        }
    }

    // Recursive DFS
    public  void dfs(Vertex vertex)
    {
        System.out.print(vertex.data + " ");
        vertex.visited=true;

        for (Vertex neighbor: vertex.neighbours)
        {
            if(neighbor != null && !neighbor.visited)
                dfs(neighbor);
        }
    }

    // Iterative DFS using stack
    // https://www.youtube.com/watch?v=iaBEKo5sM7w
    public  void dfsUsingStack(Vertex vertex)
    {
        Stack<Vertex> stack=new  Stack<>();
        stack.add(vertex);
        vertex.visited=true;

        while (!stack.isEmpty())
        {
            Vertex element = stack.pop();
            System.out.print(element.data + " ");

            for (Vertex neighbor: element.neighbours)
            {
                if (neighbor != null && !neighbor.visited)
                {
                    stack.add(neighbor);
                    neighbor.visited= true;
                }
            }
        }
    }

    public static void main(String arg[])
    {

        Vertex vertex40 =new Vertex(40);
        Vertex vertex10 =new Vertex(10);
        Vertex vertex20 =new Vertex(20);
        Vertex vertex30 =new Vertex(30);
        Vertex vertex60 =new Vertex(60);
        Vertex vertex50 =new Vertex(50);
        Vertex vertex70 =new Vertex(70);

        vertex40.neighbours.add(vertex10);
        vertex40.neighbours.add(vertex20);
        vertex10.neighbours.add(vertex30);
        vertex20.neighbours.add(vertex10);
        vertex20.neighbours.add(vertex30);
        vertex20.neighbours.add(vertex60);
        vertex20.neighbours.add(vertex50);
        vertex30.neighbours.add(vertex60);
        vertex60.neighbours.add(vertex70);
        vertex50.neighbours.add(vertex70);

        DFS dfsExample = new DFS();

        System.out.println("The DFS traversal of the graph using stack ");
        dfsExample.dfsUsingStack(vertex40);

        System.out.println();

        // Resetting the visited flag for nodes
        vertex40.visited=false;
        vertex10.visited=false;
        vertex20.visited=false;
        vertex30.visited=false;
        vertex60.visited=false;
        vertex50.visited=false;
        vertex70.visited=false;

        System.out.println("The DFS traversal of the graph using recursion ");
        dfsExample.dfs(vertex40);
    }
}