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
    Queue<Integer> list=new LinkedList<>();
    public TreeNode increasingBST(TreeNode root) {
        addInList(root);
        return populate_tree();
    }
    public void addInList(TreeNode root){
        if(root==null) return;
        addInList(root.left);
        list.offer(root.val);
        addInList(root.right);
    }
    public TreeNode populate_tree(){
        TreeNode root=new TreeNode(list.poll());
        TreeNode node=root;
        while(!list.isEmpty()){
            node.left=null;
            node.right=new TreeNode(list.poll());
            node=node.right;
        }
        return root;
    }
}