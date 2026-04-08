class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            int arr[]=new int[26];
            for(char s:str.toCharArray()){
               arr[s-'a']++;
            }
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<26;i++){
                 sb.append(arr[i]).append('#');
            }
            String ans=sb.toString();
            if(!map.containsKey(ans)){
                map.put(ans,new ArrayList<>());
            }
            map.get(ans).add(str);
        }
        return new ArrayList<>(map.values());

    }
}
