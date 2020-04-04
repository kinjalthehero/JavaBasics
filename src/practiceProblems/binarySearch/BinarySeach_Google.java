package practiceProblems.binarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinarySeach_Google {

    static Map<Integer, Integer> map = new HashMap<>();

    List<Integer> findBadVersions (int firstCommit, int lastCommit) {

        List<Integer> output = new ArrayList<Integer>();

        if (firstCommit <= lastCommit)
            return output;

        fillBadVersions(firstCommit, lastCommit, output);

        return output;
    }

    void fillBadVersions (int firstCommit, int lastCommit, List<Integer> output) {

        if (firstCommit <= lastCommit)
            return;

        int mid = firstCommit + ((lastCommit - firstCommit) / 2);

        if (!isWorse(firstCommit, lastCommit))
            return;
        else {
            findBadVersions(firstCommit, mid);
            findBadVersions(mid + 1, lastCommit);
        }


    }


    boolean isWorse (int a, int b) {

        if (map.get(a) > map.get(b))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        map.put(1, 10);
        map.put(2, 10);
        map.put(3, 9);
        map.put(4, 8);
        map.put(5, 8);
        map.put(6, 7);
        map.put(7, 7);
        map.put(8, 6);
    }

}
