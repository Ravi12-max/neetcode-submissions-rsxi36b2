

class Solution {
    public void inOrder(TreeNode root,List<Integer> ans){
        if(root==null) return;
        inOrder(root.left,ans);
        ans.add(root.val);
        inOrder(root.right,ans);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        inOrder(root,ans);
        if(ans.size()<k) return -1;
        return ans.get(k-1);
    }
}
