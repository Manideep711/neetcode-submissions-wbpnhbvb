class Solution {
    public boolean isHappy(int n) {
         HashSet<Integer> set=new HashSet<>();
  
        while(true){
                  int ans=0;
             while(n>0){
                ans += (n % 10) * (n % 10);
                n=n/10;
             }
             if(ans==1){
                return true;
             }
             if(!set.contains(ans)){
                   set.add(ans);
                   n=ans;
                   ans=0;
             }
             else{
                break;
             }
        }
        return false;
    }
}
