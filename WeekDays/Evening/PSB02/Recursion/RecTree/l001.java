

public class l001 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7};
        int tar = 10;
        // System.out.println(cobiSum_CingCoin(arr, tar, 0));
        // System.out.println(cobiSum_CingCoin01(arr, tar, 0));

        //System.out.println(cobiSum_infisupply(arr, tar, 0, ""));

        System.out.println(permuInfiCoin(arr, tar, ""));
    }
    public static int cobiSum_CingCoin(int arr[], int tar, int idx){
        // base case 
        if(tar == 0){
            return 1;
        }if(tar< 0 ){
            return 0;
        }
        int ans = 0;
        for(int curr = idx ; curr<arr.length; curr++){    
            ans += cobiSum_CingCoin(arr, tar - arr[curr], curr+1); 
        }
        return ans;

        
    }
    // the same code with smart base case 
    public static int cobiSum_CingCoin01(int arr[], int tar, int idx){
        // base case 
        if(tar == 0){
            return 1;
        }
        int ans = 0;
        for(int curr = idx ; curr<arr.length; curr++){    
            if(tar - arr[curr] >= 0) // this check will save some recursive stack space
                ans += cobiSum_CingCoin01(arr, tar - arr[curr], curr+1); 
        }
        return ans;

        
    }
    public static int cobiSum_infisupply(int arr[], int tar, int idx, String asf){
        // base case 
        if(tar == 0){
            System.out.println(" ans ->  " + asf);
            return 1;
        }
        if(tar <= 0){
            System.out.println(" Not the ans ->  " + asf);
            return 0;
        }

        int ans = 0;
        for(int curr = idx ; curr<arr.length; curr++){ 
            if(tar- arr[curr]>= 0){   
                ans += cobiSum_infisupply(arr, tar - arr[curr], curr, asf+arr[curr]+ "  ->  " ); 
            }
        }
        return ans;



    }
    public static int permuSingCoin(int arr[], int tar, String asf){ // Do we actually Need an Index here? 
        // base case 
        if(tar == 0){
            System.out.println(asf);
             return 1;
        }


        int ans = 0;
        for(int curr = 0 ; curr<arr.length; curr++){ 
            if(arr[curr] > 0 && tar- arr[curr]>= 0){
                int temp = arr[curr];   
                arr[curr] = (-1)* temp;
                ans += permuSingCoin(arr, tar - temp ,asf+temp+ "  ->  "); 
                arr[curr] = temp;
            }
        }
        return ans;

    }
    public static int permuInfiCoin(int arr[], int tar, String asf){ // Do we actually Need an Index here? 
        // base case 
        if(tar == 0){
            System.out.println(asf);
             return 1;
        }


        int ans = 0;
        for(int curr = 0 ; curr<arr.length; curr++){ 
            if(tar- arr[curr]>= 0){
               
                ans += permuInfiCoin(arr, tar - arr[curr] ,asf+arr[curr]+ "  ->  "); 
               
            }
        }
        return ans;

    }
}
