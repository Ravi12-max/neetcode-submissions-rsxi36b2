class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=1;
        int sum=0;
        int[] ans=new int[2];
        while(i<nums.length){
            j=i+1;
            while(j<nums.length){
                 sum=nums[i]+nums[j];
                 if(sum==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                 }
                 j++;
            }
            i++;
        }
        return ans;
    }
}
