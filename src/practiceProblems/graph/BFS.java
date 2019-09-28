package practiceProblems.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS
{

    static ArrayList<Node> nodes=new ArrayList<Node>();
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
    }

    public void bfs(Node node)
    {
        Queue<Node> queue = new LinkedList<>();;
        queue.add(node);
        node.visited = true;

        while (!queue.isEmpty())
        {
            Node element=queue.remove();
            System.out.print(element.data + " ");

            for (Node neighbor: element.neighbours) {
                if (neighbor != null && !neighbor.visited)
                {
                    queue.add(neighbor);
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
        System.out.println("The BFS traversal of the graph is ");
        BFS bfsExample = new BFS();
        bfsExample.bfs(node40);

    }
}
