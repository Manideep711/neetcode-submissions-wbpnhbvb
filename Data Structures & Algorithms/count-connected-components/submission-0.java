class Solution {
    public int countComponents(int n, int[][] edges) {
List<List<Integer>> adj=new ArrayList<>();
for(int i=0;i<n;i++){
    adj.add(new ArrayList<>());
}
    for(int edge[]:edges){
        int u=edge[0];
        int v=edge[1];
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
boolean visited[]=new boolean[n];
int counter=0;
for(int i=0;i<n;i++){
if(!visited[i]){
    dfs(i,visited,adj);
    counter++;
}

}
return counter;
    }
    public void dfs(int i,boolean visited[],List<List<Integer>> adj){
       visited[i]=true;
        for(int neighbour:adj.get(i)){
          if(!visited[neighbour]){
    dfs(neighbour, visited, adj);
}
        }
    }
   
}
