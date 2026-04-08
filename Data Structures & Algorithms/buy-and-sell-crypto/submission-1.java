class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int ans=Integer.MIN_VALUE;
        for(int price:prices){
            if(price<min){
                min=price;
            }
            ans=Math.max(ans,price-min);
        }
        return ans;
    }
}
