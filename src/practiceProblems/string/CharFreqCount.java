package practiceProblems.string;

import java.util.Arrays;

public class CharFreqCount {

    public static void main(String[] args) {

        String abc = "asparagus";

        int[] countFreq = new int[26];
        for (int i=0; i < abc.length(); i++) {
            char c = abc.charAt(i);
            countFreq[c - 'a']++;
        }

        System.out.println(Arrays.toString(countFreq));
    }
}
