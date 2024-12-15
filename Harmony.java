import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Harmony {

    public static void main(String[] args) throws FileNotFoundException {
        

        // File test = new File("./test.txt");

        Scanner sc = new Scanner(System.in);

        int numberOfVertices = sc.nextInt();
        int numberOfEdges = sc.nextInt();

        Graph graph = new Graph(numberOfVertices);

        for (int i = 0; i < numberOfEdges; i++) {
            graph.addEdge(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 0);

        if (bfs.getMistakes() > 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

        sc.close();


    }

}