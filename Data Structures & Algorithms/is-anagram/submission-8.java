class Solution {
    public boolean isAnagram(String s, String t) {
      int index[]=new int[26];
      for(int i=0;i<s.length();i++){
        int c=s.charAt(i);
        index[c-'a']++;
      }
      for(int i=0;i<t.length();i++){
        int c=t.charAt(i);
        index[c-'a']--;
      }
      for(int i=0;i<26;i++){
        if(index[i]!=0){
            return false;
        }
      }
      return true;
    }
}
