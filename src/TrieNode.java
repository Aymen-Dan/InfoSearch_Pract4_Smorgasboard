import java.util.ArrayList;
import java.util.HashMap;

class TrieNode {
    HashMap<Character, TrieNode> children;
    ArrayList<String> terms;

    TrieNode() {
        children = new HashMap<>();
        terms = new ArrayList<>();
    }
}