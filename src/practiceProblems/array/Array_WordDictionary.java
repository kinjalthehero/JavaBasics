package practiceProblems.array;

import java.util.HashMap;
import java.util.Map;

public class Array_WordDictionary {

    private static TrieNode root;

    public static class TrieNode {

        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord;
    }

    Array_WordDictionary() {
        root = new TrieNode();
    }

    public static void addWord(String word) {

        TrieNode temp = root;

        for (char c : word.toCharArray()) {

            if (temp.children.get(c) == null)
                temp.children.put(c, new TrieNode());

            temp = temp.children.get(c);
        }

        temp.isWord = true;
    }

    public static boolean search(String word) {
        return match(word, 0, root);
    }

    private static boolean match(String chs, int k, TrieNode node) {

        if (k == chs.length())
            return node.isWord;

        if (chs.charAt(k) == '.') {
            for (Character ch: node.children.keySet()) {
                if (node.children.get(ch) != null && match(chs, k+1, node.children.get(ch)))
                    return true;
            }
        } else
            return node.children.get(chs.charAt(k)) != null && match(chs, k + 1, node.children.get(chs.charAt(k)));

        return false;
    }

    public static void main(String[] args) {
        Array_WordDictionary wordDictionary = new Array_WordDictionary();
        wordDictionary.addWord("word");
        System.out.println(wordDictionary.search("pattern"));
        addWord("bad");
        addWord("dad");
        addWord("mad");
        System.out.println(search("pad"));
        System.out.println(search("bad"));
        System.out.println(search(".ad"));
        System.out.println(search("b.."));
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");