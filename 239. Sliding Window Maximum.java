class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // if(nums.length==0 || k==0)
        // {
        //     return new int[0];
        // }
        // int [] res=new int[nums.length-k+1];
        // for(int i=0;i<nums.length-k+1;i++)
        // {
        //     int maxi=nums[i];
        //     for(int j=i+1;j<=i+k-1;j++)
        //     {
        //         maxi=Math.max(maxi,nums[j]);
        //     }
        //     res[i]=maxi;
        // }
        // return res;
        int [] res=new int[nums.length-k+1];
        int idx=0;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!dq.isEmpty() && dq.peek()<=i-k)
            {
                dq.poll();
            }
            while (!dq.isEmpty() && nums[dq.getLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.offer(i);
            if (i >= k - 1) {
                res[idx++] = nums[dq.peek()];
            }

        }
        return res;
        
    }
}
