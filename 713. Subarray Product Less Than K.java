class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int s=0;
        int e=0;
        int p=1;
        int ans=0;
        while(e<nums.length)
        {
            p*=nums[e];
            while(p>=k && s<=e)
            {
                p=p/nums[s];
                s++;

            }
            ans+=(e-s+1);
            e++;
        }
        return ans;
        
    }
}
