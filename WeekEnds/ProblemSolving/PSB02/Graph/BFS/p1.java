package BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class p1 {
    public static void main(String[] args) {
        
    }
    public static void BFS(ArrayList<Integer>graph[], int src, int dest, boolean vis[]){
        // Take a Queue 
        Queue<Integer>q = new ArrayDeque<>();

        // Mark the current node as visited 
        vis[src] = true;
        // put it into the q
        q.add(src);
        int cl = 1;

        // now while there is element in the queue 
        while(q.size() > 0){
            System.out.println("All the nodes at a distance of "+ cl+"   unit from the source");
            int temp = q.poll();
            for(int nbr : graph[temp]){
                // add all the unvisited neibhour 
                if(vis[nbr] == false){
                    vis[nbr] = true;
                    q.add(nbr);
                    System.out.print(nbr + "  ");
                }
            }
            System.out.println();
            cl++;
        }
    }
     public static void BFS_lvl(ArrayList<Integer>graph[], int src, int dest, boolean vis[]){
        // Take a Queue 
        Queue<Integer>q = new ArrayDeque<>();

        // Mark the current node as visited 
        vis[src] = true;
        // put it into the q
        q.add(src);
        int cl = 1;

        // now while there is element in the queue 
        while(q.size() > 0){
            System.out.println("All the nodes at a distance of "+ cl+"   unit from the source");
            int len = q.size();
            while(len-- >0){
                int temp = q.poll();
                for(int nbr : graph[temp]){
                    // add all the unvisited neibhour 
                    if(vis[nbr] == false){
                        vis[nbr] = true;
                        q.add(nbr);
                        System.out.print(nbr + "  ");
                    }
                }
            }
            System.out.println();
            cl++;
        }
    }
}
