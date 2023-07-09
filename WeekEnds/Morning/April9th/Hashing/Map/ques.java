import java.util.HashMap;

public class ques {
    public static void main(String[] args) {
        // Given two arrays now print all the common elements
         //{1, 2, 2,3,4 5 6 4 5 3 } // Here frequency of any elements doesn't matter 

        //{4 5 2 1 4 3 2  }
    }
    public static void fun(int a1[], int a2[]){
        // Make a frequency table of the first array 
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int ele : a1){
            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)+1 ); //  just increase the count 
            }else{
                hm.put(ele, 1);// getting the element for the first time 
            }
        }

        // Here comes the real game 
        for(int ele : a2){
            // if the element is present 
            if(hm.containsKey(ele)){
                int frq = hm.get(ele);
                System.out.println(ele);    
                hm.put(ele, frq -1);
                if(frq == 1) hm.remove(ele);
            }
        }
    }
    public static void uniquePoints(int x[], int y[]){
        // Given x and the y cordinated of n points on a cartisian plane 
        // figure out the total no of unique points.

        x -> {1, 2, 3, 2, 1, 4, 5};
        y->  {2, 3, 2, 2, 4,  3, 6};
            2 , 13 
            21, 3

        // Soln will be using HashSet -> try it as H/W
    }
}
