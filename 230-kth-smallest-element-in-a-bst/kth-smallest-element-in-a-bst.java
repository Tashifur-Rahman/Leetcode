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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums=new ArrayList<>();
        helper(root,nums);
        return nums.get(k-1);
    }
    private void helper(TreeNode root,ArrayList<Integer> nums){
        if(root==null) return;
        helper(root.left,nums);
        nums.add(root.val);
        helper(root.right,nums);
    }
}