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
}