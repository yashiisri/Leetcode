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
    static void traverse(TreeNode root, List<String> a1, String s)
    {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
        {
            a1.add(s + root.val);
            return;
        }
        traverse(root.left, a1, s + root.val + "->");
        traverse(root.right, a1, s + root.val + "->"); 
    }
    public List<String> binaryTreePaths(TreeNode root) {

        List <String> a1 = new ArrayList<>();
        traverse(root,a1,"");
        return a1;
    }
}