class Solution {
    public int[] sortArrayByParityII(int[] nums) 
    {
        int index1=0;
        int index2=1;
        int [] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                res[index1]=nums[i];
                index1+=2;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==1)
            {
                res[index2]=nums[i];
                index2+=2;
            }
        }
        return res;

        
    }
}
