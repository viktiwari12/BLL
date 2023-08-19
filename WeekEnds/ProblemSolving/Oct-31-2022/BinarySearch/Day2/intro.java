

public class intro {
    public static void main(String[] args) {
        int arr[] = {}; // This is a nearly sorted array || which means arr[i], arr[i-1], arr[i+1]


    }
    // Code for searching in nearly sorted array 
    public static boolean nsa(int arr[], int tar){
        // apply simple binary search 

        int st = 0, end = arr.length-1;
        boolean ans = false;

        while(st<= end){
            int mid = (st + ((end -st)/2));

            if(tar == arr[mid] || tar == arr[mid-1] || tar == arr[mid]+ 1){
                ans = true;
                break;
            }else if(tar > arr[mid]){
                st = mid + 2;
            }else{
                end = mid -2;
            }

        }
        return ans;
    }

    public static int nsa1(int arr[], int tar){
        // apply simple binary search 

        int st = 0, end = arr.length-1;
        int ans = -1;

        while(st<= end){
            int mid = (st + ((end -st)/2));

            if(tar == arr[mid] ){
                ans = mid;
                break;
            }else if(tar == arr[mid-1]){
                ans = mid -1;
                break;
            }else if( tar == arr[mid]+ 1){
                ans = mid + 1;
                break;
            }else if(tar > arr[mid]){
                st = mid + 2;
            }else{
                end = mid -2;
            }

        }
        return ans;
    }

}
