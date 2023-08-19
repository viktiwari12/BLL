
import java.util.*;
public class l001 {
     //                              0     1    2      3      4      5      6      7       8      9
    public  static String codes[] = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    // Get Key Pad Combination 
    // Given a array of string where at each index the string the possible character present in that idx 
    // Given a String of Numbers "456"
    // generate all the possible messages from this 
    public static void main(String[] args) {
        getKpc("456", 0, "");
    }
    public static void getKpc(String str, int curr, String asf){
        // base case 
        if(curr == str.length()){
            System.out.println(asf);
            return;
        }

        // cuurr level -> 
        int num = str.charAt(curr) - '0';  // lvel 

        // options 
        String keys = codes[num];
        for(int i = 0; i<keys.length(); i++){
            getKpc(str, curr +1, asf+ keys.charAt(i));;
        }
    }
}
