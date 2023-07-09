
import java.util.*;
public class l001 {
    public static void main(String[] args) {
        // Let's begin with sets 


        HashSet<Integer> hs = new HashSet<>(); // By way we create a new Instance of Hashset class.

        // Things that we can do here. 

        // We can add elements in the hashset 

        hs.add(10);
        hs.add(20);
        hs.add(30);

        hs.add(10);

        hs.remove(10);
        // we can see the entire hasset 
        System.out.println(hs);

        // we can figure out the size of the hashset 

        int len = hs.size();
        System.out.println(len);

        // we can check weather a element is present in the hashset or not  

        boolean flag = hs.contains(10);
        boolean flag1 = hs.contains(50);

        System.out.println(flag);
        System.out.println(flag1);

        
    }

    // Given an array, Figure out weather it contains duplicate eleement or not?

    public static boolean containsDuplicate(int arr[]){
        // put all the elements of the array into hashset and then compare the size of the hashset and the array
        HashSet<Integer> hs = new HashSet<>();
        /*for (int val : arr)
            hs.add(val);
    
        return arr.length != hs.size(); */

        // o(N) time  + O(N) in every case 

        // we can optmise for some best case 

        
        // we have an array of 1K size

        // [1, 1, ]
        for(int ele : arr){
            if(hs.contains(ele))return true;

            hs.add(ele);
        }


       

       

        return false;
        
    }
}
