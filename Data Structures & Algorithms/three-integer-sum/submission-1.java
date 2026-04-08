class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           if(i!=0 && nums[i]==nums[i-1]){
            continue;
           }
           int j=i+1;
           int k=nums.length-1;
           while(j<k){
            if(nums[j]+nums[k]+nums[i]>0){
                k--;
            }
            else if(nums[j]+nums[k]+nums[i]==0){
                ans.add(new ArrayList(Arrays.asList(nums[i],nums[j],nums[k])));
               while(j < k && nums[j] == nums[j + 1]) j++;
    // skip duplicates for k
    while(j < k && nums[k] == nums[k - 1]) k--;
    j++;
    k--;
            }
            else{
                j++;
            }
           }
        }
        return ans;
    }
}
