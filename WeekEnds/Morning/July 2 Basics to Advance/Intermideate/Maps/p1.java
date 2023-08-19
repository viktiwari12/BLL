import java.util.*;
public class p1 {
    public static void main(String[] args) {
        // Create an In stance of HashMap class 
        HashMap<Character, Integer> hm = new HashMap<>();
        System.out.println(hm);
        hm.put('a', 10);
        System.out.println(hm);
        
          System.out.println(hm);
        hm.put('c', 30);
          System.out.println(hm);
        hm.put('d', 40);
          
        
          System.out.println(hm);
        hm.put('f', 60);
        System.out.println(hm);
        hm.put('b', 20);
        hm.put('e', 50);
        System.out.println(hm);
        System.out.println(hm);

        HashMap<Integer, Integer> hm2 = new HashMap<>();
        hm2.put(10, 1);
        hm2.put(20, 5);
        hm2.put(30, 3);
        hm2.put(40, 2);
        hm2.put(50, 7);
        hm2.put(5, 4);
        System.out.println(hm2);
        hm2.put(10, 2);
        System.out.println(hm2);
        // we can check if the key is present in the map or not 
        boolean flag = hm.containsKey(10);
        // we can remove any key value pair 
        hm.remove(10);
        // we can read the value assioacated with any key 
        hm.get(20); // it will give us the value assioated with the key 20;
        // when we put a key value pair, and the key doesnot exist in hashmap, it simpally adds the kewy value pair, but if the key 
        // is already present, it just overrides the value of the key 



    }
}
