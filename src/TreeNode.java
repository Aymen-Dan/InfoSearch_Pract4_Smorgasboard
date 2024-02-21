import java.util.ArrayList;
import java.util.HashMap;

class TreeNode {
    HashMap<Character, TreeNode> children;
    ArrayList<String> terms;

    TreeNode() {
        children = new HashMap<>();
        terms = new ArrayList<>();
    }
}