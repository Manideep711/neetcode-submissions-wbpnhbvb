class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;  // 👈 add this

        for(int x : nums){
            sum += x;
            maxSum = Math.max(maxSum, sum); // 👈 track max

            if(sum < 0){
                sum = 0;
            }
        }

        return maxSum; // 👈 return this instead
    }
}