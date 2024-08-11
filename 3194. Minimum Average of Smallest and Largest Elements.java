class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = (nums[0] + nums[nums.length - 1]) / 2.0;
        for(int i=0;i<nums.length/2;i++)
        {
            double avg=(nums[i] + nums[nums.length - 1 - i]) / 2.0;
            if(avg<min)
            {
                min=avg;
            }


        }
        return min;
        
    }
}
