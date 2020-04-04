package practiceProblems.binaryTree;

import java.util.HashMap;
import java.util.Map;

class Delete {

    TrieNode root;

    public class TrieNode {

        Map<Character, TrieNode> children = new HashMap<>();
        boolean isWord;
    }

    public Delete() {

        root = new TrieNode();
    }

    public void add (String word) {

        TrieNode curr = root;

        for (char ch: word.toCharArray()) {

            if (curr.children.get(ch) == null)
                curr.children.put(ch, new TrieNode());

            curr = curr.children.get(ch);
        }

        curr.isWord = true;
    }

    public boolean search (String word) {

        return find(word, 0, root);
    }

    public boolean find (String word, int currIndex, TrieNode node) {

        if (currIndex == word.length())
            return node.isWord;

        if (word.charAt(currIndex) == '.') {

            for (char c: node.children.keySet()) {
                if (node.children.get(c) != null && find(word, currIndex + 1, node.children.get(c)))
                    return true;
            }

        } else {
            return (node.children.get(word.charAt(currIndex)) != null && find(word, currIndex + 1, node.children.get(word.charAt(currIndex))));
        }

        return false;
    }

    public static void main(String[] args) {
        Delete wordDictionary = new Delete();
        wordDictionary.add("word");
        wordDictionary.add("bad");
        wordDictionary.add("dad");
        wordDictionary.add("mad");
        System.out.println(wordDictionary.search("pattern"));
        System.out.println(wordDictionary.search("pad"));
        System.out.println(wordDictionary.search("bad"));
        System.out.println(wordDictionary.search(".ad"));
        System.out.println(wordDictionary.search("b.."));
    }
}