
import java.util.*;

public class l001 {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 5, 6, 3, 2, 3, 2, 4, 5, 2, 2, 2, 2, 3, 6 };
        ArrayList<Integer> ans = fun(arr, 4);
        System.out.println(ans);
    }

    public static ArrayList<Integer> fun(int arr[], int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < k; i++) {
            hm.put(arr[i], (hm.getOrDefault(arr[i], 0) + 1));
        }
        ans.add(hm.size());

        int i = 0, j= k;
        while(j< arr.length){
            if(arr[i] == arr[j]){
                ans.add(hm.size());
                i++;
                j++;
                continue;
            }
            hm.put(arr[j], (hm.getOrDefault(arr[j], 0) + 1));
            if(hm.get(arr[i]) == 1d)hm.remove(arr[i]);
            else hm.put(arr[i], hm.get(arr[i])-1);

            ans.add(hm.size());
            i++; j++;
        }
        return ans;

    }
}
