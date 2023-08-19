import java.util.*;
public  class p1{
    public static void main(String[] args) {
        String arr[][] = {{"Chen", "BLR"}, {"BOM", "DEL"}, {"GOA", "Chen"}, {"DEL", "GOA"}};
        ArrayList<String> ans = fun(arr);
        System.out.println(ans);
    }
    public static ArrayList<String> fun(String[][]arr){
        HashMap<String, String> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();

        for(String[]x : arr){
            hm.put(x[0], x[1]); // Adding both source and destination in hashmap
            hs.add(x[1]);// Adding only destination in hashset 
        }
        // Let's figure out the source; 
        String src = "";
        for(String x : hm.keySet()){
            if(hs.contains(x) == false){
                src = x;
                break;
            }
        }
        // Time to Create the Itenary 
        ArrayList<String> al = new ArrayList<>();
        //al.add(src);
        boolean flag = true;
        while(flag){
            if(hm.containsKey(src) == false){
                al.add(src);
                flag = false;
                break;
            }
            String currDest = hm.get(src);
            al.add(src);
            src = currDest;
        }
        return al;

    }
    public static boolean isIsomorphic(String s1, String s2){
        if(s1.length() != s2.length()) return false;


        HashMap<Character, Character> hm = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();

        for(int i = 0; i<s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(hm.containsKey(ch1)){
                if(hm.get(ch1) != ch2) return false;
            }else{
                if(hs.contains(ch2)) return false;
                else{
                    hm.put(ch1, ch2);
                    hs.add(ch2);
                }
            }
        }
        return true;
    }
}