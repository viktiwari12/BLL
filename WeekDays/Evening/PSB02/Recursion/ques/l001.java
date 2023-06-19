import java.util.*;

public class l001 {
    public  static String codes[] = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; // this is a string array, whoch is consisting codes 
    public static void main(String[] args) {
        ArrayList<String> temp = fun("456");

        System.out.println(temp);
    }
    public static ArrayList<String> fun(String str){ // 45678
        // base case 
        if(str.length() == 1){
            ArrayList<String> Tans = new ArrayList<>();
            char ch = str.charAt(0); // "4" -> 4
            String key = codes[ch -'0'];
            for(int i = 0; i<key.length(); i++){
                Tans.add((""+ key.charAt(i)));
            }
            return Tans;
        }

        ArrayList<String> temp = fun(str.substring(1)); // Faith -> recursion will do this 
        System.out.println(temp);
        char ch = str.charAt(0); // "4" -> 4
        String key = codes[ch -'0'];
        System.out.println(key);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i<key.length(); i++){
            for(String x : temp){
                ans.add((""+ key.charAt(i)+ x));
            }
        }

        return ans;


    }
}
