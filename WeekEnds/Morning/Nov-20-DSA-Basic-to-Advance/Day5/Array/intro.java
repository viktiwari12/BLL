
public class intro {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    }

    public static void subarray(int arr[]) {
        // the forst loop => for deciding the starting position 

        for(int st = 0; st< arr.length; st++){
            // second loop =>  for deciding the ending position
            for(int end = st; end< arr.length; end ++){
                // Now we have the starting and the ending positions of the subarrays => Now simpally display the subarray 
                displaySub(arr, st, end);  
            }
        }

    }
    public static void displaySub(int arr[], int st, int end) {
        for(int i = st; i<=end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // can you tell the total no of subarrays ? 
}
