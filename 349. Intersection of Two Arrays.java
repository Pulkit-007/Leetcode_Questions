class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        for(int i:nums1)
        {
            s1.add(i);
        }
        for(int i: nums2)
        {
            s2.add(i);
        }
        s1.retainAll(s2);
        int [] ans=new int[s1.size()];
        int idx=0;
        for(int s:s1)
        {
            ans[idx++]=s;
        }
        
        return ans;

        
    }
}
