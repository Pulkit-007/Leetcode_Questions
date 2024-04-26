class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // int cnt=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         sum+=nums[j];
        //         if(sum==goal)
        //         {
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;
        return Goal(nums,goal) - Goal(nums,goal-1);
        
    }
    public static int Goal(int [] nums,int goal)
    {
        int l=0;
        int r=0;
        int sum=0;
        int cnt=0;
        while(r<nums.length)
        {
            sum+=nums[r];
            while(sum>goal && l<=r)
            {
                sum=sum-nums[l];
                l++;
            }
            cnt=cnt+(r-l)+1;
            r++;
        }
        return cnt;
    }
}
