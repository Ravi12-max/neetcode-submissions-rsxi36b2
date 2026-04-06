class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;


        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);

        int mid = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootVal) {
                mid = i;
                break;
            }
        }

        int[] leftPreorder  = Arrays.copyOfRange(preorder, 1, mid + 1);
        int[] rightPreorder = Arrays.copyOfRange(preorder, mid + 1, preorder.length);
        int[] leftInorder   = Arrays.copyOfRange(inorder, 0, mid);
        int[] rightInorder  = Arrays.copyOfRange(inorder, mid + 1, inorder.length);

        root.left  = buildTree(leftPreorder,  leftInorder);
        root.right = buildTree(rightPreorder, rightInorder);

        return root;
    }
}
