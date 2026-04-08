class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hmap=new HashMap<>();
        for(String str:strs){
            int[] map=new int[26];
            for(char s:str.toCharArray()){
              map[s-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(map[i]);
                sb.append('#');
            }
            String val=sb.toString();
            if(!hmap.containsKey(val)){
                   hmap.put(val,new ArrayList<String>());
            }
            hmap.get(val).add(str);
        }
   return new ArrayList<List<String>>(hmap.values());

    }
}
