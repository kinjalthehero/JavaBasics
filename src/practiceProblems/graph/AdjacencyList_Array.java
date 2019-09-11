package practiceProblems.graph;

class adjNode
{
    int source;
    int destination;
    adjNode next;

    public adjNode(int source, int destination)
    {
        this.source = source;
        this.destination = destination;
        next = null;
    }
}

class adjList
{
    adjNode head;
}

class Graph
{
    int V;
    adjList array[];

    public Graph(int V)
    {
        this.V = V;
        array = new adjList[V];

        for (int i = 0; i < V; i++)
        {
            array[i] = new adjList();
            array[i].head = null;
        }
    }

    public void addEdge(int source, int destination) {

        adjNode adn = new adjNode(source, destination);
        adn.next = array[source].head;
        array[source].head = adn;
    }

    public void printGraph(Graph gph)
    {
        int vertex = gph.V;
        adjNode ad;
        for (int i = 0; i < vertex; i++)
        {
            ad = gph.array[i].head;
            if(ad!=null)
            {
                System.out.println("\nNodes connected to Vertex " + ad.source + " are :");
                while (ad != null)
                {
                    System.out.print("  " + ad.destination);
                    ad = ad.next;
                }
            }
        }
    }
}

public class AdjacencyList_Array
{
    public static void main(String args[])
    {
        Graph gph = new Graph(5);
        gph.addEdge(0, 1);
        gph.addEdge(0, 2);
        gph.addEdge(0, 3);
        gph.addEdge(1, 2);
        gph.addEdge(2, 4);
        gph.printGraph(gph);
    }
}