class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int subsets=(int)Math.pow(2,nums.length)-1;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<=subsets;i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                if(((i>>j) & 1)==1)
                {
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans;
        
    }
}
