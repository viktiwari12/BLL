

public class p1 {
    public static void main(String[] args) {
        int arr[] = {1,3, 5,  4, 3, 2,5, 6, 8};

        int tar = 6;

        // Simpally Visit all the elemetns linearly/ sequentely and check if it is the target element or not? 

        int ans = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == tar) {
                ans = i; 
                break;
            }
        }

        // Now, Let's consider the above array is sorted, How can we optmise the result? 

        int a2[] = {1, 2,3, 4, 5, 6, 7, 8, 9,10};

        tar = 9;

        int st = 0, end = arr.length -1;
        while(st<= end){
            int mid = st + (end- st)/2;

            if(a2[mid] == tar){
                ans = mid; 
                break;
            }else if(a2[mid] > tar){ // target lies on the left side of the mid 
                end = mid -1;
            }else{
                st = mid + 1;
            }
        }
    }
}
