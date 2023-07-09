import java.util.*;

public class l001 {
    public static void main(String[] args) {
        // How do we create HashMap 
        HashMap<String, Integer> hm = new  HashMap<>();
        
        // some operations on hashmap
        hm.put("Aditya", 67);
        hm.put("Aritri", 75);
        System.out.println(hm);

        // we can update the vaule assoicated with any key
        // Means -> We don;t have duplicate keys in hashMap

        hm.put("Aditya", 77);
        System.out.println(hm);

        // we can also check if a key is present in map or not 
        boolean flag = hm.containsKey("Gaurav");
        System.out.println(flag);
        flag = hm.containsKey("Aritri");
        System.out.println(flag);

        // figure out total no of unique elements/keys (set/map) 

        int size = hm.size();
        fun();
    }
    public static void fun(){
        HashMap<Character, ArrayList<Integer>> hm = new HashMap<>();

        hm.put('v', new ArrayList<>());
        hm.get('v').add(10);
        hm.get('v').add(10);
        hm.get('v').add(10);
        hm.get('v').add(10);
        System.out.println(hm);
    }
}
