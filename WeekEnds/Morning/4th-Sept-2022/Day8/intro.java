class intro{
    public static void main(String[] args) {
        
        int arr[] = {10, 20, 30, 15, 28, 18, 14, 24};

        int tar = 14; // tar here is target -> 

        // just the simple task is to check weather the element is present in the array of not 
    }
    public static boolean ls(int arr[], int tar){ // here ls -> leaner search
        for(int ele : arr){
            if(ele == tar) return true;
        }
        return false;
        //  Time Complexity 

        // Best Case O(1) -> we found the element at the first place only 
        // Avg Case O(N) -> We found it somewhere in the range of second to second last 
        // Worst case O(N) -> We found it at the last position 
    }
    public static int ls01(int arr[], int tar){ // here return the Index you found the element and return -1 in case you didn't find any 

        int idx = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[idx] == tar){
                idx = i;
                break;
            }
        }
        return idx;


        
        //  Time Complexity 

        // Best Case O(1) -> we found the element at the first place only 
        // Avg Case O(N) -> We found it somewhere in the range of second to second last 
        // Worst case O(N) -> We found it at the last position 
    }

    // Binary Search || -> One of the most important topic and Google's fav


    public static int bs(int arr[], int tar){

        // Note that Binary Search is only applicable in Sorted array 
        int low = 0; 
        int high = arr.length -1;
        int ans = -1;
        while(low <= high){
            int mid = low + ((high -low)/2);
            if(tar == arr[mid]){
                // boom -> I got the ans 
                ans = mid;
            }
            else if(arr[mid] <tar){
                // Then it means the element will be on the right subarray 
                low = mid +1;
            }else{
                // this means the element is on the left subarray 
                high = mid -1;
            }
        }

        return ans;
    }
}