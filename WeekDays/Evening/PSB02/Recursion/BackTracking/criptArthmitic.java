import java.util.*;
// Lecode 1307 -> TLE
//https://leetcode.com/problems/verbal-arithmetic-puzzle/

// https://leetcode.com/problems/word-search/
public class criptArthmitic {
    public static void main(String[] args) {
        String[] words = { "SEND", "MORE" };
        String res = "MONEY";
        HashMap<Character, Integer> hm = new HashMap<>(); // Can you do this using array instead of HasHamp.
        HashSet<Character> hs = new HashSet<>();
        String unq = unqstr(words, res, hm, hs);
        boolean vis[] = new boolean[10];
        boolean ans = assingDigits(words, res, hm, unq, 0, vis, hs);
       // System.out.println(hm);
        System.out.println(ans);
        

    }
    //Expectaion -> Assign (0-9) to all the characters of unique string 
    //  Task -> I will assign the dig to the first character of the unique string 
    // Faith -> Recursion will assign all digs to all the remaning character of the unique string 
    public static boolean assingDigits(String[] words, String res, HashMap<Character, Integer> hm, String unq, int curr, boolean vis[], HashSet<Character> hs) {
        // base case 
        if(curr == unq.length()){
            boolean temp = isValidCombination(words, res, hm);// Yet to be disscussed 
            if(temp) System.out.println(hm);
            return temp;
        }
        boolean ans = false;
        for(int dig = 0; dig <10; dig++){
            if(!vis[dig]){
                if(dig == 0){
                    if(hs.contains(unq.charAt(curr)) == false){ // curr character is not a starting character of any string 
                        vis[dig] = true;
                        // assign the digit to the character 
                        hm.put(unq.charAt(curr), dig); // task done 
                        // call the recursive fun 
                        ans = ans || assingDigits(words, res, hm, unq, curr+1, vis, hs); // Faith -> this will assign the values to alll the remaning characters
                       // if(ans) return true; // just for the case, when it's asked if a valid assingment exist -> be mindful if asked to print all combination we can't 
                        vis[dig] = false; 
                        // Should I put -1 in hm for the same char :-> can do but not needed just waste of time 
                    }
                }else{
                    vis[dig] = true;
                    // assign the digit to the character 
                    hm.put(unq.charAt(curr), dig); // task done 
                    // call the recursive fun 
                    ans = ans || assingDigits(words, res, hm, unq, curr+1, vis, hs); // Faith -> this will assign the values to alll the remaning characters
                    //if(ans) return true;
                    vis[dig] = false; 
                }
            }

        }

        return ans;
    }

    public static String unqstr(String[] words, String res, HashMap<Character, Integer> hm, HashSet<Character> hs ) {
        StringBuilder sb = new StringBuilder();

        for (String temp : words) {
            for (int i = 0; i < temp.length(); i++) {
                char ch = temp.charAt(i);
                if(i == 0) hs.add(ch);
                if (!hm.containsKey(ch)) {
                    hm.put(ch, -1);
                    sb.append(ch);
                }
            }
        }

        // Don't forget to add the last string
       
        for (int i = 0; i < res.length(); i++) {
            char ch = res.charAt(i);
            if(i == 0) hs.add(ch);
            if (!hm.containsKey(ch)) {
                hm.put(ch, -1);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static boolean isValidCombination(String[] words, String res, HashMap<Character, Integer> hm){
        // what -> find the sum of the number formed from all the strings in the word array 
        // find the number formed bu the result string 
        // check if both are equal or not 

        int num = 0; 
        for(String str : words){
            num += getNum(str, hm);
        }
        
        int temp = getNum(res, hm);
        return (num == temp);

    }
    public static int getNum(String str, HashMap<Character, Integer> hm){
        int num = 0; 
        for(int i = 0; i< str.length(); i++){
            num = (num*10)+ hm.get(str.charAt(i));
        }
        return num;
    }
}
