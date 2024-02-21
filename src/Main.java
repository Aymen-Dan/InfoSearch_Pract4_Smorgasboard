import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InvertedTree invertedTree = new InvertedTree();
        invertedTree.insert("apple");
        invertedTree.insert("app");
        invertedTree.insert("banana");

        // Search for terms starting with "app"
        ArrayList<String> result = invertedTree.search("app");
        System.out.println(result); // Output: [apple, app]
    }
}