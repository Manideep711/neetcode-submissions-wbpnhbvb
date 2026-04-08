class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(0,nums,target,current,ans);
        return ans;
    }
    public void backtrack(int index,int[] nums,int target,List<Integer> current,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(index==nums.length){
            return;
        }
        if(nums[index]<=target){
            current.add(nums[index]);
            backtrack(index,nums,target-nums[index],current,ans);
                   current.remove(current.size()-1);
        }
 
        backtrack(index+1,nums,target,current,ans);
    }
}
