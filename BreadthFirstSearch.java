import edu.princeton.cs.algs4.Queue;

public class BreadthFirstSearch {
    
    private boolean[] marked;
    private String[] color;
    private int mistakes;

    public BreadthFirstSearch(Graph graph, int s) {
        marked = new boolean[graph.V()];
        color = new String[graph.V()];
        mistakes = 0;
        bfs(graph, s);
    }

    private void bfs(Graph G, int s) {
        Queue<Integer> q = new Queue<Integer>();
        marked[s] = true;
        if (color[s] == null) {
            color[s] = "red";
        }
        q.enqueue(s);

        while (!q.isEmpty()) {
            int v = q.dequeue();
            String colorOfV = color[v];
            for (Integer[] pair : G.adj(v)) {
                int w = pair[0];
                int type = pair[1];
                if (color[w] == null) {
                    if (type == 1) {
                        color[w] = colorOfV == "red" ? "blue" : "red";
                    } else {
                        color[w] = colorOfV;
                    }    
                } else if (color[w].equals(colorOfV)) {
                    if (type == 1) {
                        mistakes++;
                    }
                } else {
                    if (type == 0) {
                        mistakes++;
                    }
                }
    
                if (!marked[w]) {
                    marked[w] = true;
                    q.enqueue((w));
                }
            }
        }
    }

    public int getMistakes() {
        return mistakes;
    }

}
