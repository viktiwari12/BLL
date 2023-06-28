import javax.swing.text.html.HTMLDocument.RunElement;

public class l003 {
    public static void main(String[] args) {
        
    }
    public static boolean fun(int arr[], int tar, int curr){
        // base case 
        if(tar == 0) return true;

        if(curr == 0) return false;


        if(arr[curr-1] <= tar){ // Note here that nth element will be found on (n-1)th index  in the array -> current is basically representing the count of the elements 
            return fun(arr, tar- arr[curr-1], curr-1) || fun(arr, tar, curr-1);
        }else{
            return fun(arr, tar, curr -1);
        }


        // Draw recursive tree 
        // Figure out the base 
        // Figure out if there is any operlapping subPriblem or not?

    }

    public static boolean Equiset(int arr[]){
        /// given an array, figure out can u divide the array into two subset, whose sum is euqall 

        // note: any element can not remain ideal, it has to in either of the subset and at the same time no element can be in both the subset
    }
}
