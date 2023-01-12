class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num: nums)
        {
            set.add(num);
        }
        int longest=0;
        for(int num: nums)
        {
            if(!set.contains(num-1))
            {
                int currnum=num;
                int curr=1;
                while(set.contains(currnum+1))
                {
                    currnum+=1;
                    curr+=1;
                }
                longest=Math.max(longest,curr);
            }
            
        }
        return longest;
        
    }
}
