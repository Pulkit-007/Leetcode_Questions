class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int n = nums1.length, n2 = nums2.length;
        int[] res = new int[n];

        Map<Integer,Integer> mpp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i : nums2) {
            while(!st.isEmpty() && st.peek() < i) {
                mpp.put(st.pop(), i);
            } 
            st.push(i);
        }

        for(int i=0; i<n; i++) {
            res[i] = mpp.getOrDefault(nums1[i], -1);
        }

        return res;
    }
}
