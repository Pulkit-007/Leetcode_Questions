class Solution {
    public int First(int [] nums,int target)
    {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }

    public int Last(int [] nums,int target)
    {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            {
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int [] res=new int[2];
        res[0]=First(nums,target);
        res[1]=Last(nums,target);
        return res;

        
    }
}
