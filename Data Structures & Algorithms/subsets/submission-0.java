class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
 backtrack(0,current,ans,nums);
 return ans;
    }
    public void backtrack(int index,List<Integer> current,List<List<Integer>> ans,int[] nums){
        if(index==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        backtrack(index+1,current,ans,nums);
        current.remove(current.size()-1);
        backtrack(index+1,current,ans,nums);
    }
}
