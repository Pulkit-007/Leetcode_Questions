class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer=new ArrayList<>();
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        List<Integer> a1=new ArrayList<>();
        List<Integer> a2=new ArrayList<>();
        for(int n: nums1)
        {
            s1.add(n);
        }
        for(int n: nums2)
        {
            s2.add(n);
        }
        for(int n:s1)
        {
            if(!s2.contains(n))
            {
                a1.add(n);
            }
        }
        for(int n:s2)
        {
            if(!s1.contains(n))
            {
                a2.add(n);
            }
        }
        answer.add(a1);
        answer.add(a2);
        return answer;
        
        
    }
}
