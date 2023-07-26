import java.util.*;
class p1{
    public static class pair{
        int u;
        int v;
        int w;
        pair(int u, int v, int w){
            this.u = u; 
            this.v = v;
            this.w = w;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in)

        System.out.println("Entetr the Total no of Nodes ");
        int n = scn.nextInt();
         System.out.println("Entetr the Total no of Edges ");
         int ed = scn.nextInt();
         // crrate three array of ed length 

         int U[] = new int[ed];
         int V[] = new int[ed];
         int W[] = new int[ed];

        for(int i = 0; i<ed; i++){
            System.out.println("Enter the Source Node of  " + i+ "th edge  ");
            U[i] = scn.nextInt(); 
            System.out.println("Enter the end  Node of  " + i+ "th edge  ");
            V[i] = scn.nextInt(); 
            System.out.println("Enter the weight of  " + i+ "th edge  ");
            W[i] = scn.nextInt(); 
        }

        
    }
    public static int[][] constructGraph(int n, int ed, int U[], int V[], int W[]){
        int graph[][] =  new int[n][n];

        for(int i = 0; i< ed; i++){
            int src = U[i], dest = V[i], wt = W[i];
            graph[src][dest] = wt;

            // In case of Bideirectional graph =>  graph[dest][src] = wt;
        }

        return graph;
    }
    public static ArrayList<pair> [] constructGraph02(int n, int ed, int U[], int V[], int W[]){
        // ArrayList/Array of arrayList 
        // Create a array of N size

        ArrayList<pair> graph[] = new ArrayList[n]; // here we have created array, but we have not created arraylsit inside the array 

        // can I start adding edge here? 
        for(int i = 0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i< ed; i++){
            int src = U[i], dest = V[i], wt = W[i];
            pair temp = new pair(src, dest, wt);

            graph[src].add(temp);
        }

        return graph;
    }
    public static  HashMap<Integer, ArrayList<pair>> constructGraph03(int n, int ed, int U[], int V[], int W[]){
        // ArrayList/Array of arrayList 
        // Create a array of N size

       HashMap<Integer, ArrayList<pair>> graph  = new HashMap<>();; // here we have created array, but we have not created arraylsit inside the array 

        // can I start adding edge here? 
        

        for(int i = 0; i< ed; i++){
            int src = U[i], dest = V[i], wt = W[i];
            pair temp = new pair(src, dest, wt);

            if(!graph.containsKey(src)){
                graph.put(src, new ArrayList<>());
            }
            
            graph.get(src).add(temp);
            
        }
        return graph;
    }
}