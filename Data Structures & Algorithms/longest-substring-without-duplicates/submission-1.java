class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        HashSet<Character> set=new HashSet<>();
        int max=0;
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
            }
            set.add(s.charAt(j));
            j++;
            max=Math.max(max,j-i);
        }
        return max;
    }
}
