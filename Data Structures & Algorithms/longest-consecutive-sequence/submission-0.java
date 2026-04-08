class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int current=1;
                int num=nums[i];
                while(set.contains(num+1)){
                     current++;
                     num++;
                }
                max=Math.max(max,current);
            }
        }
        return max;
    }
}
