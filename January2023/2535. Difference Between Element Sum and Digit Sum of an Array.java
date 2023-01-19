class Solution {
    public int differenceOfSum(int[] nums) {
        int dsum=0;
        int esum=0;
        for(int i=0;i<nums.length;i++)
        {
            esum+=nums[i];
            while(nums[i]!=0)
            {
                dsum+=nums[i]%10;
                nums[i]/=10;
            }
        }
        return Math.abs(esum-dsum);
        
    }
}
