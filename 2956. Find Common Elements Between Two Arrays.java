class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int [] res=new int[2];
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    cnt1++;
                    break;
                }
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=0;j<nums1.length;j++)
            {
                if(nums2[i]==nums1[j])
                {
                    cnt2++;
                    break;
                }
            }
        }
        res[0]=cnt1;
        res[1]=cnt2;
        return res;


        
        
    }
}
