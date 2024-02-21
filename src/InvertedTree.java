import java.util.ArrayList;

class InvertedTree {
    TrieNode root;

    InvertedTree() {
        root = new TrieNode();
    }

    void insert(String term) {
        TrieNode node = root;
        for (char c : term.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
            node.terms.add(term);
        }
    }

    ArrayList<String> search(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            if (!node.children.containsKey(c)) {
                return new ArrayList<>(); // Prefix not found
            }
            node = node.children.get(c);
        }
        return node.terms;
    }
}