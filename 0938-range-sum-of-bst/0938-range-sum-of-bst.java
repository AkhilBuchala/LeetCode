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
    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        dfs(root, low, high);
        return sum;
    }
    
    public void dfs(TreeNode node , int low , int high) {
        if(node != null) {
            if(low <= node.val && node.val <= high) {
                sum = sum + node.val;
            }
            if(low<node.val){
                dfs(node.left, low, high);
            }
            if(node.val<high) {
                dfs(node.right, low, high);
            }
        }
    }
}