class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return Distinct(nums,k) - Distinct(nums,k-1);
    }
    public static int Distinct(int [] nums,int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int cnt=0;
        while(r<nums.length)
        {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k)
            {
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                {
                    map.remove(nums[l]);
                }
                l++;

            }
            cnt=cnt+(r-l)+1;
            r++;
        }
        return cnt;
    }
}
