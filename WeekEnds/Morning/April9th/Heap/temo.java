package Heap;

public class temo {
    
}
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        infi_combi_sub(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }
    public void infi_combi(int[] nums, int target, int idx, List<List<Integer>> ans , List<Integer> temp){
        // base case 
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i< nums.length; i++){
            if(nums[i] <= target){
                temp.add(nums[i]);
                infi_combi(nums, target - nums[i], i, ans, temp);
                temp.remove(temp.size() -1);
                
            }
        }
        return;
    }
    public void infi_combi_sub(int[] nums, int target, int idx, List<List<Integer>> ans , List<Integer> temp){
        //.  base case 
        if(target == 0 || idx == nums.length){
            if(target == 0){
                ans.add(new ArrayList<>(temp));
                return;
            }
            return;
        }
        
        int ele = nums[idx];
        if(ele <= target){
            temp.add(ele);
            infi_combi_sub(nums, target - ele, idx, ans, temp);
            temp.remove(temp.size() -1);
        }
        infi_combi_sub(nums, target , idx + 1, ans, temp);
    }
}
