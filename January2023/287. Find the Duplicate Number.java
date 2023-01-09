class Solution {
    public int findDuplicate(int[] nums) {
     // Naive Approach
    //     int ans=0;
    //     Arrays.sort(nums);
    //     for(int i=1;i<nums.length;i++)
    //     {
    //         if(nums[i-1]==nums[i])
    //         ans=nums[i];
    //     }
    //     return ans;
    // }
      
      
      //Optimal Solution
    int s=nums[0];
    int f=nums[0];
    do
    {
        s=nums[s];
        f=nums[nums[f]];
    }while(s!=f);
    f=nums[0];
    while(s!=f)
    {
        s=nums[s];
        f=nums[f];
    }
    return s;
}
}
