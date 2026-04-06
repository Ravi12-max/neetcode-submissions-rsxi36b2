class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:nums) map.put(ele,map.getOrDefault(ele,0)+1);
        ArrayList<Integer> al = new ArrayList<>(map.keySet());
        al.sort((a,b)->map.get(b)-map.get(a));
        int[] ans = new int[k];
        for(int i=0;i<k;i++) ans[i]=al.get(i);
        return ans;
    }
}
