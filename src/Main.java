import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\armad\\OneDrive\\Desktop\\IntelliJ IDEA Community Edition 2021.1.1\\IdeaProjects\\InfoSearch_Pract4_Smorgasboard\\src\\res";

        Index idx = new Index(filePath);
        InvertedTree t = new InvertedTree();
        t.insertFromFiles(filePath);
        t.saveToFile("src/results/InvertedTree.txt");

        //PermutIndex pi = new PermutIndex(idx);

        //KIndex k = new KIndex(idx);

        Scanner in = new Scanner(System.in);

        System.out.println("\n1.Show tree;\n2.Show permut. index;\n3.Show K index;\n4.Search tree" +
                ";\n5.Search PI;\n6.Search KI;\n-1.Exit\n");
        int i = in.nextInt();

        while(i != -1) {
            switch (i) {
                case 1:
                    t.printInvTree();
                    break;
                case 2:
                  //  pi.printPermutIndex();
                    break;
                case 3:
                  //  k.printKIndex();
                    break;
                case 4:
                    System.out.println("Enter:");
                    in.nextLine();
                    String input = in.nextLine();
                    t.search(input);
                    //System.out.println("Sorry! Tree Search doesn't work :(");
                    break;
                case 5:
                    System.out.println("Enter PI:");
                    input = in.nextLine();
                   // System.out.println(pi.search(input));
                    break;
                case 6:
                    System.out.println("Enter KIndex:");
                    in.nextLine();
                    input = in.nextLine();
                   // System.out.println(k.search(input));
                    break;
                default:
                    System.out.println("Wrong format");
            }
            System.out.println("\n1.Show tree;\n2.Show permut. index;\n3.Show K index;\n4.Search tree" +
                    ";\n5.Search PI;\n6.Search KI;\n-1.Exit\n");
            i = in.nextInt();
        }

    }
}
