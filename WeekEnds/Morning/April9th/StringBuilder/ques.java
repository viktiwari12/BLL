import java.util.ArrayList;
import java.util.Scanner;

import javax.print.FlavorException;

public class ques {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        // First take input as what is the total no if element 
        // int len = scn.nextInt();
        int i = 1;
        while(i<= 50){
            al.add(i);
            i++;
        }
        // System.out.println(al);
        //  removeAllPrime01(al);
        // System.out.println(al);

        int[][] arr = {{5,3,5,6,3},
                        {5,8,3,98,1},
                        {2,5,6,7,3},
                        {10,20,30,40,50},
                        {12,24,56,76,98}
                        };
                        
        int ans = diffofBlackWhite(arr);
        System.out.println(ans);

    }

    //Given an ArrayList of Numbers, Remove all the Prime no
    public static boolean checkPrime(int n){
        // Given a number n, check if it;s prime or not 
        for(int i = 2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    /* Will Resume at 10 : 40 */
    public static ArrayList<Integer> removeAllPrime(ArrayList<Integer> al){
        for(int idx = al.size()-1; idx >=0; idx--){
            int ele = al.get(idx);
            boolean flag  = false;
            for(int i = 2; i<idx; i++){
                if(idx % i == 0){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                al.remove(idx);
            }
        }
        return al;
    }
    public static void removeAllPrime01(ArrayList<Integer> al){

        for(int idx = al.size()-1; idx >=0; idx--){
            if(checkPrime(al.get(idx))){
                al.remove(idx);
            }
        }
    }

    public static int diffofBlackWhite(int arr[][]){
        // Given a 2-D array,Which represent a Chess Board
        // in chess Board you have some black and some white spots 

        // Find the dfference of sum of all the black spoots and the WHite Spots
        int black = 0;
        int white = 0;

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                if((i+j) % 2 == 0){
                    white+= arr[i][j];
                }else{
                    black += arr[i][j];
                }
            }
        }
        System.out.println("Sum of Black Spots  " + black);
        System.out.println("Sum of White Spots  " + white);
        return black -white;
    }
    
    
}
