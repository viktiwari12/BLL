package DynamicPrograming.Strings;

public class p2 {
    public static void main(String[] args) {
        
    }
    public static int longestPalindromicSubsequence(String s1, int l1, int l2){
        // base case 
        if(l1>l2) return 0;

        char ch1 = s1.charAt(l1-1);
        char ch2 = s1.charAt(l2-1);

        if(ch1 == ch2){
            return longestPalindromicSubsequence(s1, l1+1, l2-1) + 2; // +1 for the current char
        }else{
            int x = longestPalindromicSubsequence(s1,  l1+1, l2);
            int y = longestPalindromicSubsequence(s1,  l1, l2-1);
            return Math.max(x, y);
        }
    }
}
