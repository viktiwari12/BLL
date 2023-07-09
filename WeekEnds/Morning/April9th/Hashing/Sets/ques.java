import java.util.HashSet;

public class ques{
    public static void main(String[] args) {
        // Give two arrays print all the unique common elements of both arrays 

        //{1, 2, 2,3,4 5 6 4 5 3 } // Here frequency of any elements doesn't matter 

        //{4 5 2 1 4 3 2  }

        // Take a hashset 
        // Put all the elements of the first arry in the hashset 
        // Itetrate in the second array 
        // look if the current element is present in the hashset or not 

        int arr[] = {1, 2,3 , 4, 5};
        int tar = 10;
        boolean flag = twoSum(arr, tar);
        System.out.println(flag);

    }
    // public static void uniqueCommonElements(int a1[], int a2[]){
    //     HashSet<Integer> hs = new HashSet<>();
    //     for(int ele : a1)hs.add(ele);

    //     for(int ele : a2){
    //         if(hs.contains(ele)){
    //             System.out.println(ele);
    //             hs.remove(ele);
    //         }
    //     }
    // }
    // Given an array and a target number, figure out if there exist a pair, whose sum is euqal to target

    //{1 2 1 3  5} tar 10 


     //1 2 : 1 + 2 = 3   2 + 1 = 3 

     public static boolean twoSum(int arr[], int tar){
        HashSet<Integer> hs = new HashSet<>();
        for(int ele : arr){
            System.out.println("curr ele is  " + ele);
            System.out.println("Checking if the " + (tar-ele)+ "  is present or not ");
            if(hs.contains(tar-ele)){
                System.out.println("Wallah found ");
                return true;
            }
                
            else{
                System.out.println("Dind't find the complement so adding the current ele i.e   " + ele);
                hs.add(ele);
            }
        }
        return false;
     }
}