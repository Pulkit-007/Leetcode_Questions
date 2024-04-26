class Solution {
    public int numberOfSubarrays(int[] nums, int k) 
    {
        return Goal(nums,k) - Goal(nums,k-1);
    }
     public static int Goal(int [] nums,int goal)
    {
        int l=0;
        int r=0;
        int sum=0;
        int cnt=0;
        while(r<nums.length)
        {
            sum+=nums[r]%2;
            while(sum>goal && l<=r)
            {
                sum=sum-nums[l]%2;
                l++;
            }
            cnt=cnt+(r-l)+1;
            r++;
        }
        return cnt;
    }
}
