import java.util.*;
public class l001 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7};
        int tar = 10;
        // ArrayList<ArrayList<Integer>>sol= new ArrayList<>();
        // int ans = combi_singCoin(arr, tar, 0, new ArrayList<>(),sol);
        // int ans2 = combi_singCoin01(arr, tar, 0, "");

        // System.out.println(ans);
        // System.out.println(ans2);

        int ans3 = permu_infi_coin(arr, tar,  "");
        System.out.println(ans3);
    }
    public static void display(ArrayList<Integer> temp){
        for(int ele : temp){
            System.out.print(ele + "   ");
        }
        System.out.println();
    }
    public static int combi_singCoin(int arr[], int tar, int curr, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>>sol){
        //Base Case 
        if(tar == 0) {
            display(temp);
            sol.add(new ArrayList<>(temp)); // O(N) but time and space involved here will not be considered in complexity analysis 
            return 1; // We have found one combination 
        }
        if(tar < 0 || curr == arr.length) return 0; // in these senario, we don't have any further possibilities

        int ans = 0;
        for(int idx = curr; idx<arr.length; idx++){
            // Here we two choice -> 
            // 1-> Make a blind call and then hadel all the possible base case 

            temp.add(arr[idx]);
            ans += combi_singCoin(arr, (tar -arr[idx]), (idx +1), temp, sol); // if I pass idx++? will it work?
            temp.remove(temp.size()-1);
        }
        return ans;
    }
    public static int combi_singCoin01(int arr[], int tar, int curr, String asf){
        //Base Case 
        if(tar == 0) {
            System.out.println(asf);
            return 1; // We have found one combination 
        }

        int ans = 0;
        for(int idx = curr; idx<arr.length; idx++){
            // Here we two choice -> 
            // 2-> Make a smart call, so that u don't have to handel multiple base cases
            if(arr[idx] <= tar){
                ans += combi_singCoin01(arr, (tar -arr[idx]), idx +1, (asf+ arr[idx] + " ->  ")); // if I pass idx++? will it work?
            }
        }
        return ans;
    }

    public static int combi_Infi_Coin(int arr[], int tar, int curr, String asf){

        if(tar == 0) {
            System.out.println(asf);
            return 1; // We have found one combination 
        }

        int ans = 0;
        for(int idx = curr; idx<arr.length; idx++){
            // Here we two choice -> 
            // 2-> Make a smart call, so that u don't have to handel multiple base cases
            if(arr[idx] <= tar){
                ans += combi_Infi_Coin(arr, (tar -arr[idx]), idx , (asf+ arr[idx] + " ->  ")); // if I pass idx++? will it work?
            }
        }
        return ans;
    }

    public static int permu_infi_coin(int arr[], int tar,  String asf){
        if(tar == 0) {
            System.out.println(asf);
            return 1; // We have found one combination 
        }

        int ans = 0;
        for(int idx = 0; idx<arr.length; idx++){
            // Here we two choice -> 
            // 2-> Make a smart call, so that u don't have to handel multiple base cases
            if(arr[idx] <= tar){
                ans += permu_infi_coin(arr, (tar -arr[idx]),  (asf+ arr[idx] + " ->  ")); // if I pass idx++? will it work?
            }
        }
        return ans;
    }
    // without taking any extra sapce || -> manipulating the data
    public static int permu_sinl_coin(int arr[], int tar,  String asf){
        if(tar == 0) {
            System.out.println(asf);
            return 1; // We have found one combination 
        }

        int ans = 0;
        for(int idx = 0; idx<arr.length; idx++){
            // Here we two choice -> 
            // 2-> Make a smart call, so that u don't have to handel multiple base cases

            // here is a hack, I can only apply calls for the elements wheich were not used earlier ? The Problem is How do I keep a check of that? 
            if(arr[idx] >=0){
                if(arr[idx] <= tar){
                    int temp = arr[idx];
                    arr[idx] = (-1)*temp;
                    ans += permu_sinl_coin(arr, (tar -temp),  (asf+ temp + " ->  ")); // if I pass idx++? will it work?
                    arr[idx] = temp;
                }
            }
        }
        return ans;
    }

    // With taking an extra space 
    public static int permu_sinl_coin01(int arr[], int tar,  String asf, boolean vis[]){
        if(tar == 0) {
            System.out.println(asf);
            return 1; // We have found one combination 
        }

        int ans = 0;
        for(int idx = 0; idx<arr.length; idx++){
            // Here we two choice -> 
            // 2-> Make a smart call, so that u don't have to handel multiple base cases


            // here is a hack, I can only apply calls for the elements wheich were not used earlier ? The Problem is How do I keep a check of that? 
            if(!vis[idx]){
                if(arr[idx] <= tar){
                    vis[idx] = !vis[idx];
                    ans += permu_sinl_coin01(arr, (tar -arr[idx]),  (asf+ arr[idx] + " ->  "), vis); // if I pass idx++? will it work?
                    vis[idx] = !vis[idx];
                }
            }
        }
        return ans;
    }
}
