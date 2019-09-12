package practiceProblems.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSort
{
    Stack<Node> stack = new Stack<>();;

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

        public String toString()
        {
            return ""+data;
        }
    }

    public  void toplogicalSort(Node node)
    {
        List<Node> neighbours= node.neighbours;

        // Take one neighbor at a time and recursively call the method
        for (int i = 0; i < neighbours.size(); i++)
        {
            Node neighbor = neighbours.get(i);

            if(neighbor != null && !neighbor.visited)
            {
                toplogicalSort(neighbor);
                neighbor.visited=true;
            }
        }

        // Once we visit all the neighbors, we push the node to stack
        stack.push(node);
    }

    public static void main(String arg[])
    {
        TopologicalSort topological = new TopologicalSort();
        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.neighbours.add(node10);
        node40.neighbours.add(node20);
        node10.neighbours.add(node30);
        node20.neighbours.add(node10);
        node20.neighbours.add(node30);
        node20.neighbours.add(node60);
        node20.neighbours.add(node50);
        node30.neighbours.add(node60);
        node60.neighbours.add(node70);
        node50.neighbours.add(node70);

        System.out.println("Topological Sorting Order:");
        topological.toplogicalSort(node40);

        // Print contents of stack
        Stack<Node> resultStack=topological.stack;

        while (resultStack.empty()==false)
            System.out.print(resultStack.pop() + " ");
    }

}

