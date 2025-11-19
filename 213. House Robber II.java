class Solution {
    public static int maximumNonAdjacentSum(int [] nums) {
		// Write your code here.
		int n=nums.length;
		int prev=nums[0];
		int prev2=0;
		for(int i =1;i<n;i++)
		{
			int pick=nums[i]; 
			if(i>1) pick+=prev2;
			int notpick=0+prev;
			int curri=Math.max(pick,notpick);
			prev2=prev;
			prev=curri;
		}
		return prev;
	}

    public int rob(int[] nums) {
        int n=nums.length;
        int [] temp1=new int[n];
        int [] temp2=new int[n];
        if(n==1) return nums[0];
        for(int i =0;i<n;i++)
        {
            if(i!=0) temp1[i]=nums[i];
            if(i!=n-1) temp2[i]=nums[i];
        }
        return Math.max(maximumNonAdjacentSum(temp1),maximumNonAdjacentSum(temp2));
        
    }
}                  
