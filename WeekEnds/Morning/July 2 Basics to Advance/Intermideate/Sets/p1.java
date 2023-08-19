import java.util.*;

public class p1 {
    public static void main(String[] args) {
        // First Initiliase HashSet 

        HashSet<Integer> hs = new HashSet<>(); // We have created an Instance of HashSet Class 
        // We can add elementx in the hashset 
        System.out.println(hs);
        hs.add(10);
        System.out.println(hs);
        hs.add(20);
        System.out.println(hs);
        hs.add(30);
        System.out.println(hs);
        hs.add(40);
        System.out.println(hs);

        // Check weather an element exist in the mapo or not ? 

        boolean flag = hs.contains(10);
        System.out.println(flag);
        flag = hs.contains(70);
        System.out.println(flag);

        // There is a very unique property of HashSet 
        // In HashSet, duplicate elements are overridden -> duplicate elements are not stored 
        hs.add(10);
        hs.add(20);
        System.out.println(hs);
        // removing an elemnt from hashset 

        hs.remove(10);System.out.println(hs);
    }
    public static void uuniqueCommonElements(int a1[], int a2[]){
        HashSet<Integer> hs = new HashSet<>();

        for(int ele : a1){
            hs.add(ele);
        }
        // Now the real game begins 

        for(int ele : a2){
            if(hs.contains(ele)){
                System.out.println(ele);
                hs.remove(ele);
            }
        }
        
    }
}
