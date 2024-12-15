public class Edge {
    
    private int type;
    private int v;
    private int w;

    public Edge(int v, int w, int type) {
        this.type = type;
        this.v = v;
        this.w = w;
    }

    public int getType() {
        return type;
    }

    public int getV() {
        return v;
    }

    public int getW() {
        return w;
    }

}
