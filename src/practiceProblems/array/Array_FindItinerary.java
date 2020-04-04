package practiceProblems.array;

import java.util.*;

public class Array_FindItinerary {



    public static List<String> findItinerary(List<List<String>> tickets) {

        Map<String, PriorityQueue<String>> targets = new HashMap<>();
        List<String> output = new LinkedList();

        for (List<String> ticket : tickets)
            targets.computeIfAbsent(ticket.get(0), k -> new PriorityQueue()).add(ticket.get(1));
        visit("JFK", output, targets);
        return output;
    }

    static void visit(String airport, List<String> output, Map<String, PriorityQueue<String>> targets) {
        while(targets.containsKey(airport) && !targets.get(airport).isEmpty())
            visit(targets.get(airport).poll(), output, targets);
        output.add(0, airport);
    }

    public static void main(String[] args) {

        //String[][] list = new String[][]{{},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};

        List<List<String>> list = Arrays.asList(Arrays.asList("JFK","SFO"), Arrays.asList("JFK","ATL"), Arrays.asList("SFO","ATL"), Arrays.asList("ATL","JFK"), Arrays.asList("ATL","SFO"));

        System.out.println(findItinerary(list));
    }
}
