import java.util.*;

public class o2 {
    // Given two unsorted arrays 
    // Print all the common elements  
    public static void main(String[] args) {
        
    }
    public static void getAllCommonElement(int a1[], int a2[]){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int ele :a1){
            if(hm.containsKey(ele)){ // element is already present in map, just increment it's frequency
                hm.put(ele, hm.get(ele) + 1);
            }else{
                hm.put(ele, 1); // putting element for the first time 
            }
        }

        // Here the real game bigins 
        for(int ele : a2){
            if(hm.containsKey(ele)){
                int pfq = hm.get(ele);
                if(pfq == 1){
                    System.out.println(ele);
                    hm.remove(ele);
                }else{
                    hm.put(ele, pfq-1);
                }
            }
        }
    }
}

