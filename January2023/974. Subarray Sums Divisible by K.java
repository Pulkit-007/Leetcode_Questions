class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int runningsum=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            runningsum+=nums[i];
            int remainder=runningsum%k;
            if(remainder<0) remainder+=k;
            if(map.containsKey(remainder))
            {
                c+=map.get(remainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return c;
        
    }
}
