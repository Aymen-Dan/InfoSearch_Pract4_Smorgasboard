import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        String filePath = "C:\\Users\\armad\\OneDrive\\Desktop\\IntelliJ IDEA Community Edition 2021.1.1\\IdeaProjects\\InfoSearch_Pract4_Smorgasboard\\src\\res";

        Index idx = new Index(filePath);

        InvertedTree t = new InvertedTree(filePath);

        PermutIndex pi = new PermutIndex(idx);

        ThreeGIndex tg = new ThreeGIndex(idx);

        Scanner in = new Scanner(System.in);

        System.out.println("\n0 - Show index; \n1 - Show inverted tree;\n2 - Show permutation index;\n3 - Show 3-gram index in file;\n4 - Search inverted tree" +
                ";\n5 - Search permutation index;\n6 - Search 3-gram index;\n-1 - Exit\n");
        int i = in.nextInt();

        while(i != -1) {
            switch (i) {
                case 0:
                    //idx.print();
                    idx.openIndexTXT("src/results/Index.txt");
                    break;
                case 1:
                   // t.printInvTree();
                    t.openInvertedTreeTXT("src/results/InvertedTree.txt");
                    break;
                case 2:
                  //pi.printPermutIndex();
                    pi.openPermutIndexTXT("src/results/PermutIndex.txt");
                    break;
                case 3:
                  tg.printThGndex();
                  tg.openThreeGIndexTXT("src/results/ThreeGIndex.txt");
                    break;
                case 4:
                    System.out.println("Enter:");
                    in.nextLine();
                    String input = in.nextLine();
                    t.search(input);
                    //System.out.println("Sorry! Tree Search doesn't work :(");
                    break;
                case 5:
                    System.out.println("Enter Permutation Index (use * in place of a chunk of word):");
                    in.nextLine();
                    input = in.nextLine();
                   System.out.println(pi.search(input));
                    break;
                case 6:
                    System.out.println("Enter 3-gram Index (use * in place of a chunk of word):");
                    in.nextLine();
                    input = in.nextLine();
                   System.out.println(tg.search(input));
                    break;
                default:
                    System.out.println("Option unavailable. Please choose from the list");
            }
            System.out.println("\n0 - Show index; \n1 - Show inverted tree;\n2 - Show permutation index;\n3 - Show 3-gram index in file;\n4 - Search inverted tree" +
                    ";\n5 - Search permutation index;\n6 - Search 3-gram index;\n-1 - Exit\n");
            i = in.nextInt();
        }

    }
}
