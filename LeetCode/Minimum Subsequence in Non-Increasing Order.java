/* Program to print Pascal's Triangle for given number of Rows
* Dated - 11 July 2023
* Author - Akshay Dev S V */ 


class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        //Sort the Array nums
        Arrays.sort(nums);
        int sum=0;
        int count=0;
        List<Integer> result=new ArrayList<Integer>();

        for(int n:nums){
            sum+=n;
        }

        for(int i=nums.length-1;i>=0;i--){
            result.add(nums[i]);
            sum-=nums[i];
            count+=nums[i];
            if(count>sum){
                return result;
            }
        }
        return result;
    }
}