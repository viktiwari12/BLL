import java.util.HashMap;
import java.util.HashSet;

public class l001 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // We can add the value in haspmap 
        hm.put("India", 100000);
        hm.put("UK", 800000);

        hm.put("Japan", 423565);


        // Similar to hashSet,we can Display the values here 
        System.out.println(hm);

        // if we add a pair, whose key is already in HashMap, the value will get updated 

        hm.put("India", 30000);
        System.out.println(hm);


        // In Hashset we were checking weatrher the element is present or not 
        // In HashMap, the comparision is done of KEY 

        boolean flag = hm.containsKey("Japan");

        boolean flag1 = hm.containsKey("Singapore");

        System.out.println(flag);
        System.out.println(flag1);

        // We can check the Size of the HashMap 

        int len = hm.size();

        int arr[] = {1, 2, 1, 1,1 ,1 , 3, 5, 4, 2, 2 , 3, 4, 5};
        GetFrequency(arr);
    }
    // Most common Use Case of hasHMap 

    public static void GetFrequency(int arr[]){
        // Tell the Frequency of all the unique elements 

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int ele : arr){
            // first Check Weather the element is Present in the array or Not 
            if(hm.containsKey(ele)){
                // Then get the Previous frequency, and update it with an Addition 1 in that 
                int pf = hm.get(ele);
                int nf = pf+1;
                hm.put(ele,  nf);

                // hm.put(ele, (hm.get(ele)+1))
            }else{
                // Means this element is coming for the First Time and hense it's frequency will be 1;
                hm.put(ele, 1);
            }
        }
       
        for(int ele : hm.keySet()){
            System.out.println(ele + "  ->  " + hm.get(ele));
        }
        System.out.println(hm);
    }
    public static void GetUniqueCommonElements(int a1[], int a2[]){
        // Figure out all the Common Elements b/w a1 & a2

        //1, 2, 1, 1 || {1 , 2, 1, 3}  => 1 2 1 

        HashSet<Integer> hs = new HashSet<>();

        // First Put all the elements of the first array into hashset

        for(int ele: a1){
            hs.add(ele);
        }

        // Now Here Comes the real Game 
        for(int ele : a2){
            if(hs.contains(ele)){
                System.out.println(ele);
                hs.remove(ele);  // Why doing this Step ? TO Handel the Duplicacy 
            }
        }
    }
    public static void GetCommonElements(int a1[], int a2[]){
        // Same as above 
        // Just Use Maps Insted of sets 


        // First Make the Frequency Table . 
        // Then Itetrate over the second array 
        // if(present ){
            // Print the number, and then Check if the frequency is 1 then  delete it fro the map or else just decrement the Frequency.
        

    }

}
