class Solution {
    public boolean isAnagram(String s, String t) {
     char[] sa=new char[26];
     char[] ta=new char[26];
     for(char S:s.toCharArray()){
          sa[S-'a']++;
     }
     for(char T:t.toCharArray()){
          ta[T-'a']++;
     }
     return Arrays.equals(sa,ta);
    }
}
