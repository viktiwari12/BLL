import java.util.*;
public class criptArth {
    public static void main(String[] args) {
        String arr[] = {"send", "more"};
        String tar = "money";
        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        // Build a string with all the unique characters 
        for(String temp: arr){
            for(int i = 0; i<temp.length(); i++){
                char ch = temp.charAt(i);
                if(!hm.containsKey(ch)){
                    hm.put(ch, -1);
                    sb.append(ch);
                }
            }
        }
        for(int i = 0; i<tar.length(); i++){
            char ch = tar.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch, -1);
                sb.append(ch);
            }
        }

        String uniq = sb.toString();
        
    }
    public static int getIntVal(String str, HashMap<Character, Integer>hm){
        int ans = 0;

        for(int i = 0; i< str.length(); i++){
            int dig = hm.get(str.charAt(i));
            ans = (ans* 10) + dig;
        }
        return ans;
    }
    public static boolean isValidCombi(String arr[], String tar,HashMap<Character, Integer>hm ){
        int x  = 0; 
        for(String temp : arr){
             x += getIntVal(temp, hm);
          
        }

        int y = getIntVal(tar, hm);
        return (x == y);
    }
    public static int  fun(String unq, HashMap<Character, Integer>hm, int curr, boolean vis[], String arr[], String tar){
        // base case 
        if(curr == unq.length()){ // means all the unique characters have been allocated some digs/values 
            // Now just check if it's a perfect combination or not ? 
            if(isValidCombi(arr, tar, hm)){
                return 1;
            }
        }

        int ans = 0;
        for(int dig = 0; dig<=9; dig++){
            if(!vis[dig]){
                vis[dig] = true;
                hm.put(unq.charAt(curr), dig);  // I am allocating the digit to the character 
                ans += fun(unq, hm, curr+1, vis);
                // don't forget to unmark the visited 
                vis[dig] = !vis[dig];
            }
        }

        return ans;
    }

    

}
