import java.util.*;

class l002{
    public static class Edge{
        int v;
        int w;
        Edge(int v, int w){
            this.v = v;
            this.w = w;
        }
    }
    public static void main(String[] args){
        ArrayList<Edge>graph[] = new ArrayList[9]; 
        //ConstructGraph(graph);
        for(ArrayList<Edge> ele: graph){
            System.out.println(ele);
        }
        //System.out.println(arr[3][2]);
        
    }
}