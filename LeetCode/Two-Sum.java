class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            while(j<nums.length){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
                j++;
            }
        }
        return ans;
}
}
