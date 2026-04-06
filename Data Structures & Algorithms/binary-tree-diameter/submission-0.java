class Solution {
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        maxDepth(root);
        return max;
    }
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        int leftValue=maxDepth(root.left);
        int rightValue=maxDepth(root.right);
        max=Math.max(max,leftValue+rightValue);
        return 1 + Math.max(leftValue,rightValue);

    }
}
