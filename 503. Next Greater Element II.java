class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] nge=new int[nums.length];
        Stack<Integer> sc=new Stack<>();
        int n=nums.length;
        for(int i=2*n-1;i>=0;i--)
        {
            while(!sc.isEmpty() && sc.peek()<=nums[i%n])
            {
                sc.pop();
            }
            if(i<n)
            {
                nge[i]=sc.isEmpty()?-1:sc.peek();
            }
            sc.push(nums[i%n]);
        }
        return nge;
        
    }
}
