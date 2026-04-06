class Solution {
    public int longestConsecutive(int[] nums) {
        int longestCount=0;
        Set<Integer> set = new HashSet<>();
        for(int ele:nums) set.add(ele);
        for(int i:set){
            
            if(!set.contains(i-1)){
                int x=i;
                int count=1;
                while(set.contains(x+1)){
                x++;
                count++;
                }
                longestCount=Math.max(count ,longestCount);
            }
            
        }
        return longestCount;
    }
}
