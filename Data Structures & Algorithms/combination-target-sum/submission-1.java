class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(0,current,ans,nums,target);
        return ans;
    }
    public void backtrack(int index,List<Integer> current,List<List<Integer>> ans,int[] nums,int target){
        if(target==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(index>=nums.length){
            return;
        }
        if(nums[index]<=target){
            current.add(nums[index]);
            backtrack(index,current,ans,nums,target-nums[index]);
            current.remove(current.size()-1);
        }
         backtrack(index+1,current,ans,nums,target);
    }
}
