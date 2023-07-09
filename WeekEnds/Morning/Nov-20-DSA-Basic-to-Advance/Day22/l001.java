import java.util.*;

public class l001 {
    public static class Edge{
        int v;
        int w;
        Edge(int v, int w){
            this.v = v;
            this.w = w;
        }
    }
    // public static void addEdgeUNI(ArrayList<Edge> graph[], int u, int v, int w){
    //     graph[u].add(new Edge(v, w));
    // }
    public static void addEdgeBi(ArrayList<Edge> graph[], int u, int v, int w){
        graph[u].add(new Edge(v, w));
        graph[v].add(new Edge(u, w));
    }
    public static void dfs(int src, ArrayList<Edge> graph[], boolean []vis){
      // The very step. 
      // Mark the curr node as visited 
      vis[src] = true; 
      System.out.println(src);
      for(int i = 0; i< graph[src].size(); i++){
        Edge ed = graph[src].get(i);
        int next = ed.v;

        if(vis[next] == false){
            dfs(next, graph, vis);
        }

      }
    }
    public static void Display(ArrayList<Edge> graph[]){
        for(int u = 0; u< graph.length; u++){
            System.out.print("{  [ " + u + "  ] ->  ");

            for(Edge ed : graph[u]){
                System.out.print(" (  " + ed.v + " ,  " + ed.w + "  )  ");
            }

            System.out.println(" } ");
        }
    }
    public static int FindEdge(ArrayList<Edge> graph[], int u, int v){
        for(int i = 0; i< graph[u].size(); i++){
            Edge curr = graph[u].get(i);
            if(curr.v == v) return i;
        }

        return -1;
    }
    public static void RemoveEdge(ArrayList<Edge> graph[], int u, int v){
        int x = findEdge(graph, u, v);
        int y = findEdge(graph, v, u);

        if(x != -1){
            graph[u].remove(x);
            graph[v].remove(y);
        }
    }
    
    public static void RemoveVertex(ArrayList<Edge> graph[], int u){
        for(int i = graph[u].size()-1; i>=0 i--){
            RemoveEdge(graph, u, graph[u].get(i));
        }
    }
    public static boolean hasPath(ArrayList<Edge> graph[], int u, int v){
        if(u == v) return true;

        boolean ans = false;

        for(int i = 0; i< graph[u].size(); i++){
            ans = ans || hasPath(graph, graph[u].get(i).v, v);
        }
        return ans;
    }
    public static void ConstructGraph(ArrayList<Edge> graph[]){
        int n = graph.length; // this n is the total no of vertexes;

        // first initilise the arrayList inside the array, as prevoiusly it will be pointing to null

        for(int v = 0; v<n; v++){
            graph[v] = new ArrayList<>();
        }

        addEdgeBi(graph, 0, 1, 10);
        addEdgeBi(graph, 0, 6, 10);

        addEdgeBi(graph, 1, 5, 20);
        addEdgeBi(graph, 1, 2, 5);

        addEdgeBi(graph, 2, 4, 50);
        addEdgeBi(graph, 2, 3, 50);

        addEdgeBi(graph, 3, 4, 30);

        addEdgeBi(graph, 5, 6, 10);
        addEdgeBi(graph, 5, 7, 20);
        addEdgeBi(graph, 5, 8, 20);

        addEdgeBi(graph, 7, 8, 20);
        
    }
    public static void main(String[] args){
        // to store the Information of the graph,

     
        
        ArrayList<Edge>graph[] = new ArrayList[9]; 
        ConstructGraph(graph);

        // let;s display the graph

        Display(graph);

    }
    // DSF -> BFS  and Sorting Algorithms Next Class
}
