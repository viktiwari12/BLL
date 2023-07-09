import java.util.*;
public class l001{
    public static void main(String[] args) {
        // The very first step
        // How do we create a HashSet
        HashSet<Integer> hs = new HashSet<>();

        // Few very Common things to do with hashset / or Some popular methods 

        // Adding elements into the hashset 

        hs.add(10);
        System.out.println(hs);
        hs.add(20);
        System.out.println(hs);
        hs.add(10);
        System.out.println(hs);
        hs.add(30);
        System.out.println(hs);
        hs.add(40);
        System.out.println(hs);
        hs.add(20);
        System.out.println(hs);

        // We can check , if an element is present in hashset or not 
        boolean flag = hs.contains(10);
        System.out.println(flag);

        flag = hs.contains(100);
        System.out.println(flag);

        // We can also remove the elements from the haset '
        hs.remove(10);
        System.out.println(hs);
    }
}