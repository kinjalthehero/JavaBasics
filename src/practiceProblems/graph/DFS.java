package practiceProblems.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS
{
    static class Node
    {
        int data;
        boolean visited;
        List<Node> neighbours;

        Node(int data)
        {
            this.data=data;
            this.neighbours=new ArrayList<>();

        }

        public void addneighbours(Node neighbourNode)
        {
            this.neighbours.add(neighbourNode);
        }

        public List<Node> getNeighbours()
        {
            return neighbours;
        }

        public void setNeighbours(List<Node> neighbours)
        {
            this.neighbours = neighbours;
        }
    }

    // Recursive DFS
    public  void dfs(Node node)
    {
        System.out.print(node.data + " ");
        node.visited=true;

        List<Node> neighbours=node.getNeighbours();

        for (Node neighbor: neighbours)
        {
            if(neighbor != null && !neighbor.visited)
                dfs(neighbor);
        }
    }

    // Iterative DFS using stack
    // https://www.youtube.com/watch?v=iaBEKo5sM7w
    public  void dfsUsingStack(Node node)
    {
        Stack<Node> stack=new  Stack<>();
        stack.add(node);
        node.visited=true;

        while (!stack.isEmpty())
        {
            Node element = stack.pop();
            System.out.print(element.data + " ");

            List<Node> neighbours = element.getNeighbours();

            for (Node neighbor: neighbours)
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

        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addneighbours(node10);
        node40.addneighbours(node20);
        node10.addneighbours(node30);
        node20.addneighbours(node10);
        node20.addneighbours(node30);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);

        DFS dfsExample = new DFS();

        System.out.println("The DFS traversal of the graph using stack ");
        dfsExample.dfsUsingStack(node40);

        System.out.println();

        // Resetting the visited flag for nodes
        node40.visited=false;
        node10.visited=false;
        node20.visited=false;
        node30.visited=false;
        node60.visited=false;
        node50.visited=false;
        node70.visited=false;


        System.out.println("The DFS traversal of the graph using recursion ");
        dfsExample.dfs(node40);
    }
}