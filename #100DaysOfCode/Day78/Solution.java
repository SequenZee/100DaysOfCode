public class Solution {
    static final int ALPHABET_SIZE = 26;

    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    };

    static void insert(TrieNode root, String key) {
        TrieNode node = root;

        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (node.children[ch - 'a'] == null)
                node.children[ch - 'a'] = new TrieNode();

            node = node.children[ch - 'a'];
        }

        node.isEndOfWord = true;
    }

    static boolean search(TrieNode root, String key) {
        TrieNode node = root;

        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (node.children[ch - 'a'] == null)
                return false;

            node = node.children[ch - 'a'];
        }

        return node.isEndOfWord;
    }

    public static void main(String[] args) {
        int n = 8;
        String[] list = { "the", "a", "there", "answer", "any", "by", "bye", "their" };
        String key = "the";

        TrieNode root = new TrieNode();
        for (String word : list) {
            insert(root, word);
        }

        boolean output = search(root, key);
        System.out.println(output ? 1 : 0);
    }
}
