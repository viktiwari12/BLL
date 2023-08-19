public class l002 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7};
        int tar = 10;  
        int ans = permu_infi_Coin_sub(arr, tar, 0, "");
        System.out.println(ans);
    }
    public static int combi_singCoin_sub(int arr[], int tar, int curr, String asf){
        // base case -> will figure out later on 
       if(tar == 0){
            System.out.println(asf);
            return 1;
        }
        if(curr == arr.length) return 0;

        if(arr[curr ] <= tar ){
            int pick = combi_singCoin_sub(arr, tar - arr[curr ], curr +1 , (asf+ arr[curr]+ " -> "));
            int notPick = combi_singCoin_sub(arr, tar, curr +1 , asf);
            return pick + notPick;
        }else{
            return combi_singCoin_sub(arr, tar, curr-1, asf);
        }
    }
    public static int combi_infi_Coin_sub(int arr[], int tar, int curr, String asf){
        if(tar == 0){
            System.out.println(asf);
            return 1;
        }
        if(curr == arr.length) return 0;
        if(arr[curr -1] <= tar ){
            int pick = combi_infi_Coin_sub(arr, tar - arr[curr ], curr , ( "" + arr[curr]+ " -> " +asf));
            int notPick = combi_infi_Coin_sub(arr, tar, curr +1 , asf);
            return pick + notPick;
        }else{
            return combi_infi_Coin_sub(arr, tar, curr+1 , asf);
        }
    }
    public static int permu_Sing_Coin_sub(int arr[], int tar, int curr, String asf){
        return 0;
    }
    public static int permu_infi_Coin_sub(int arr[], int tar, int curr, String asf){
        if(tar == 0){
            System.out.println(asf);
            return 1;
        }
        if(curr == arr.length) return 0;

        if(arr[curr ] <= tar ){
            int pick = permu_infi_Coin_sub(arr, tar - arr[curr ], 0 , ( "" + arr[curr]+ " -> " +asf));
            int notPick = permu_infi_Coin_sub(arr, tar, curr +1, asf);
            return pick + notPick;
        }else{
            return permu_infi_Coin_sub(arr, tar, curr+1, asf);
        }
    }
}
