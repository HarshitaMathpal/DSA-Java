class Solution {
    TreeNode prev=null;
    int min=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return min;

    }
    private int inorder(TreeNode root){
        if(root==null){
            return 0;
        }

        inorder(root.left);
        if(prev!=null){
            min=Math.min(min,root.val-prev.val);
        }
        prev=root;
        inorder(root.right);
        return min;
    }
}
