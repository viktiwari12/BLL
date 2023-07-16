import java.util.*;
public class p1 {
    public static void main(String[] args) {
        // How do we define ArrayList? 
        // Syntax of the ArrayList

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(al);

        // adding elements into the arrayList 

        al.add(10);
        System.out.println(al);
        al.add(20);
        System.out.println(al);
        al.add(30);
        System.out.println(al);
        al.add(40);
        System.out.println(al);

        // deleting the elements from arraylist 

        al.remove(al.size()-1);
        System.out.println(al);
        al.remove(al.size()-1);
        System.out.println(al);

    }
    // Given an arraylist, Remove all the prime nos from the arraylist 
    public static void removePrimes(ArrayList<Integer> al){
        for(int i = al.size()-1; i>=0; i--){
            if(isPrime(al.get(i)) ){
                al.remove(i);
            }
        }
    }
    public static boolean isPrime(int n){

    }
    public static void printAllPalindromeSubarray(int arr[]){
        for(int st = 0; st<arr.length; st++){
            for(int end = st; end <arr.length; end++){
                // HEre is the regoin we want to Print all the elements b/w st -> end 
                if(isPalindrome(arr, st, end)){
                    print(arr, st, end);
                }
            }
            System.out.println();
        }        
    }
    public static boolean isPalindrome(int arr[], int i, int j){
        while(i<j){
            if(arr[i++] != arr[j--]) return false;
        }
        return true;
    }
    public static void print(int arr[], int i, int j){
        while(i<= j){
            System.out.print(arr[i++] + "  ");
        }
        System.out.println();
    }
}
