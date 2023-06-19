import javax.print.attribute.standard.Copies;

public class subs {
    public static void main(String[] args) {
        
    }
    public static int combi_sing_Coin(int arr[], int tar, int idx){
        // base case 
        if(tar == 0){
            return 1;
        }
        if(idx > arr.length) return 0;

        // quick Question 
        /*
         *  if(idx > arr.length && tar != 0) return 0;
         *  if(tar == 0)  return 1;
         */


         if(arr[idx]<= tar){
            // here I have both the option pick or don't pick
            return combi_sing_Coin(arr, tar-arr[idx], idx+1) + combi_sing_Coin(arr, tar, idx+1);
         }else{
            // just have one single option .i.e don't pick 

            return combi_sing_Coin(arr, tar, idx+1);
         }
        //  int ans = 0;
        //  if(arr[idx]<= tar){
        //     ans += combi_sing_Coin(arr, tar - arr[idx], idx+1);
        //  }  

        //  ans += combi_sing_Coin(arr, tar, idx+1);

        //  return ans;
    }
    public static int combi_Infi_Coin(int arr[], int tar, int idx){
        if(tar == 0){
            return 1;
        }
        if(idx > arr.length) return 0;


         int ans = 0;
         if(arr[idx]<= tar){  // tar -> 5 
            ans += combi_sing_Coin(arr, tar - arr[idx], idx);
         }  

         ans += combi_sing_Coin(arr, tar, idx+1);

         return ans;
    }

    public static int Permu_Sing_Coin(int arr[], int tar, int idx){
        // base case 
        if(tar == 0){
            return 1;
        }
        if( idx == arr.length) return 0;

        int ans = 0; 

       if(arr[idx] >0){
        // for this element I have option to Pick or don't Pick 

        if(tar- arr[idx] >= 0){
            int temp = arr[idx];
            arr[idx] = (-1)* temp; // mark for picking further  // Integer.Max_Value;
            ans += Permu_Sing_Coin(arr, tar -temp, 0);
            arr[idx] = temp;  // making it back 
        } 
            ans += Permu_Sing_Coin(arr, tar, idx+1);
        }
        return ans;

       
       
    }
    [2 3 5 7]
    public static int Permu_Sing_Coin(int arr[], int tar, int idx, boolean []vis){
        // base case 
        if(tar == 0){
            return 1;
        }
        if( idx == arr.length) return 0;

        int ans = 0; 

       if(vis[idx] == false){ // this is the first check, if this elemnt is precoiusly used or not 
        // for this element I have option to Pick or don't Pick 

        if(tar- arr[idx] >= 0){
            vis[idx] = true;
            //arr[idx] = (-1)* temp; // mark for picking further  // Integer.Max_Value;
            ans += Permu_Sing_Coin(arr, tar -arr[idx], 0);
            vis[idx] = false; // making it back 
        } 
           
        }
        ans += Permu_Sing_Coin(arr, tar, idx+1); // recursive call to not pick 
        return ans;

       
       
    }
    public static int Permu_Infi_Coin(int arr[], int tar, int idx){
        return 0;
    }

    
}
