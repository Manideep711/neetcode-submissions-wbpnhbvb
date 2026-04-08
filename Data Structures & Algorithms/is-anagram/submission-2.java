class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()){
        return false;
    }
    char[] sa=new char[26];
    char[] ta=new char[26];
    for(char c:s.toCharArray()){
        sa[c-'a']++;
    }
     for(char c:t.toCharArray()){
        ta[c-'a']++;
    }
    return Arrays.equals(sa,ta);
    }
}
