class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<>();
        map.put('}','{');
         map.put(')','(');
          map.put(']','[');
          Stack<Character> stack=new Stack<>();
          for(char x:s.toCharArray()){
  
             if(x=='{' || x=='(' || x=='['){
                stack.push(x);
             }
             else{
                if(stack.isEmpty() ||(stack.pop()!=map.get(x))){
                    return false;
                }
             }
          }
          return stack.isEmpty();

    }
}
