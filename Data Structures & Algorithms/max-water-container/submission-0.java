class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int max=0;
        int current=0;
        while(i<j){
            current=(j-i)*Math.min(heights[i],heights[j]);
            max=Math.max(current,max);
           if(heights[i]>heights[j]){
            j--;
           }
           else{
            i++;
           }
          
        }
        return max;
    }
}
