package dataStructure.Grap;
//边
public class Edge {
    private char u;//结点1
    private char v;//结点2
    private int weight;//边的权重
    Edge(char u,char v,int weight){
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    public char getU() {
        return u;
    }

    public char getV() {
        return v;
    }

    public int getWeight() {
        return weight;
    }

    public void setU(char u) {
        this.u = u;
    }

    public void setV(char v) {
        this.v = v;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
