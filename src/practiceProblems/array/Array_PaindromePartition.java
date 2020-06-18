package practiceProblems.array;

import java.util.ArrayList;
import java.util.List;

public class Array_PaindromePartition {

    public List<List<String>> partition(String str) {

        List<List<String>> result = new ArrayList<List<String>>();
        List<String> curr = new ArrayList<String>();

        dfs(str,0, curr, result);

        return result;
    }

    public void dfs (String origString, int pos, List<String> curr, List<List<String>> result) {

        if (pos == origString.length())
            result.add(new ArrayList<>(curr));
        else {
            for(int i = pos; i < origString.length(); i++) {

                if(isPalindrome (origString, pos, i)) {
                    curr.add(origString.substring(pos, i+1));
                    dfs (origString,i+1, curr, result);
                    curr.remove (curr.size()-1);
                }
            }
        }
    }

    public boolean isPalindrome(String s, int low, int high) {

        while(low<high)
            if(s.charAt(low++) != s.charAt(high--))
                return false;

        return true;
    }

}
