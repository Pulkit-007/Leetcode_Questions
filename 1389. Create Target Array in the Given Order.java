class Solution {
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        int [] ans=new int[nums.length];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(index[i],nums[i]);
            
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=al.get(i);

        }
        return ans;
        
    }
}
