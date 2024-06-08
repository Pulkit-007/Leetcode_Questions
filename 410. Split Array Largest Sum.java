import java.util.Arrays;
import java.util.Collections;
class Solution {
     public static int countStudents( int [] nums,int pages)
    {
        int n=nums.length;
        int students=1;
        long pagesStudent=0;
        for(int i=0;i<n;i++)
        {
            if(pagesStudent+nums[i]<=pages)
            {
                pagesStudent+=nums[i];
            }
            else{
                students++;
                pagesStudent=nums[i];
            }
        }
        return students;
    }
    
    public static int findPages(int [] nums, int n, int m) {
        // Write your code here.
        if(m>n) return -1;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int x:nums){
            low=Math.max(low,x);
            high+=x;
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            int students=countStudents(nums, mid);
            if(students>m)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;

    }
    public int splitArray(int [] nums, int k) {
        return findPages(nums,nums.length,k);
        
    }
}
