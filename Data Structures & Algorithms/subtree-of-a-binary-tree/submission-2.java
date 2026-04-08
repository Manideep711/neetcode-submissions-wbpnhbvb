/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
           Queue<TreeNode> queue=new LinkedList<>();
           boolean ans=false;
           queue.offer(root);
           while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            if(temp.val==subRoot.val && isSameTree(temp,subRoot) ){
               return true;
            }
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
           }
           return ans;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        
        return (p.val==q.val)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
