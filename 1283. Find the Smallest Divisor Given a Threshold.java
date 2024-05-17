class Solution {
    public static int sumByD(int[] nums, int div) {
        int n = nums.length; //size of array
        //Find the summation of division values:
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.ceil((double)(nums[i]) / (double)(div));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        int low =1;
        int high=max;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(sumByD(nums,mid)<=threshold)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
        
    
}
}
