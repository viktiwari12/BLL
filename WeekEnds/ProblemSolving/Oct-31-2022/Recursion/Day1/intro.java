
public class intro {
    public static void main(String[] args) {
        int arr[] = {2 , 3 ,5, 7};
        int tar = 10;

        //int ans = combi_sin_coin_sub(arr, 0, tar);

        //System.out.println(ans);

        print_combi_infi_coin_sub(arr, 0, tar, "");
    }

    public static int combi_sin_coin_sub(int arr[], int idx, int tar){
        // base case (Will figure out in some time )
        if (tar == 0 || idx == arr.length) 
            return tar == 0? 1: 0;

       
        int ans = 0; 
       

        // every time I have two options 

        // either pick the element 
    
        if(tar >= arr[idx] )
            ans +=  combi_sin_coin_sub(arr, idx+1, tar-arr[idx]);

        // don't pick the element

        ans += combi_sin_coin_sub(arr, idx+1, tar);
        return ans;
    }
    public static int combi_infi_coin_sub(int arr[], int idx, int tar){

        if (tar == 0 || idx == arr.length) 
            return tar == 0? 1: 0;

       
       
        int ans = 0;
        if(tar >= arr[idx] )
            ans +=  combi_infi_coin_sub(arr, idx, tar-arr[idx]);

        // don't pick the element

        ans += combi_infi_coin_sub(arr, idx+1, tar);
        return ans;
    }


    public static void print_combi_infi_coin_sub(int arr[], int idx, int tar, String psf){

        if (tar == 0 || idx == arr.length){
            if(tar== 0)
                System.out.println("MissionPassed " + psf);
            else
                System.err.println(psf);

            return;
        } 
        if(tar >= arr[idx] )
              print_combi_infi_coin_sub(arr, idx, (tar-arr[idx]), (psf+"+"+arr[idx]+ "   "));

        // don't pick the element
        
        print_combi_infi_coin_sub(arr, idx+1, tar,( psf+"-"+arr[idx]+ "   "));  
    }


    
}
