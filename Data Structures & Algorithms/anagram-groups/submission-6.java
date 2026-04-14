class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
           Map<String,List<String>> map=new HashMap<>();
          for(String str:strs){
            int[] freqMap=new int[26];
            for(char s:str.toCharArray()){
                freqMap[s-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(freqMap[i]);
                sb.append('#');
            }
            String value=sb.toString();
      if(!map.containsKey(value)){
        map.put(value,new ArrayList<String>());
      } 
      map.get(value).add(str);
          }
          return new ArrayList<>(map.values());
    }
}
