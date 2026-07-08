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
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> l = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        Stack<TreeNode> s1 = new Stack<>();
        if(root==null){
            return l;
        }
        s.push(root);
        while(!s.isEmpty()){
             root=s.pop();
             s1.push(root);
             if(root.left!=null){
                s.push(root.left);
            }
            if(root.right!=null){
                s.push(root.right);
            }
            
           
        }
        while(!s1.isEmpty()){
            l.add(s1.pop().val);
        }
        return l;
    }
}