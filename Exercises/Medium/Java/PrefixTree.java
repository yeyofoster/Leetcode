/*
* LeetCode
* 208. Implement Trie (Prefix Tree)
*/
package Exercises.Medium.Java;

import java.util.HashMap;
import java.util.Map;

public class PrefixTree {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.search("apple"); // return True
        trie.search("app"); // return False
        trie.startsWith("app"); // return True
        trie.insert("app");
        trie.search("app");
    }
}

class TrieNode {
    HashMap<Character, TrieNode> children;
    boolean endOfWord;

    public TrieNode() {
        this.children = new HashMap<Character, TrieNode>();
        this.endOfWord = false;
    }

    public String printNodes() {
        return this.children.toString();
    }
}

class Trie {
    TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            if (currentNode.children.containsKey(word.charAt(i))) {
                currentNode = currentNode.children.get(word.charAt(i));
            } else {
                TrieNode newNode = new TrieNode();
                currentNode.children.put(word.charAt(i), newNode);
                currentNode = newNode;
            }
        }
        currentNode.endOfWord = true;
        printTrie(root);
    }

    public boolean search(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            if (!currentNode.children.containsKey(word.charAt(i))) {
                return false;
            } else {
                currentNode = currentNode.children.get(word.charAt(i));
            }
        }

        System.out.println(String.format("The tree contains '%s' word?: %b", word, currentNode.endOfWord));
        return currentNode.endOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode currentNode = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (!currentNode.children.containsKey(prefix.charAt(i))) {
                return false;
            } else {
                currentNode = currentNode.children.get(prefix.charAt(i));
            }
        }
        System.out.println(String.format("The tree contains '%s' prefix?: %b", prefix, true));
        return true;
    }

    public void printTrie(TrieNode node) {
        for (Map.Entry<Character, TrieNode> set : node.children.entrySet()) {
            System.out.println(String.format("Node: %c - EndOfWord: %b - Children: %s", set.getKey(),
                    set.getValue().endOfWord, set.getValue().printNodes()));
            if (!set.getValue().children.isEmpty()) {
                printTrie(set.getValue());
            }
        }
    }
}