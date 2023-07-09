import java.util.HashMap;
import java.util.HashSet;

public class intro {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        
        /*  hs.add(10);
        // hs.add(20);
        // hs.add(30);
        // hs.add(40);
        // hs.add(10);
        // hs.add(10);
        // hs.add(10);
        // hs.add(10);
        // hs.add(50);
        // System.out.println(hs);

        // System.out.println(hs.size());
        // System.out.println(hs.contains(10));
        // hs.remove(10);
        // System.out.println(hs);

        // System.out.println(hs.size());

        // System.out.println(hs.contains(10)); */



        HashMap<Integer, String> hm = new HashMap<>();
        hm.
        hm.put(1, "Viaksh");
        hm.put(2, "Amit");
        hm.put(3, "Akansha");
        hm.put(4, "Akansha");
        hm.put(3, "Priya");
        hm.put(6, "Gunjan");

        System.out.println(hm);

        System.out.println(hm.get(1));
        System.out.println(hm.get(2));
        System.out.println(hm.get(3));
        System.out.println(hm.get(4));
        System.out.println(hm.get(5));
        System.out.println(hm.get(6));
        

        System.out.println(hm.containsKey(6));
        System.out.println(hm.containsKey(8));



        for(int ele : hm.keySet() )
            System.out.println(hm.get(ele));

    }
}
