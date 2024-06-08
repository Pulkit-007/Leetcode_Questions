import java.util.*;

public class Solution 
{
     public static int countStudents(ArrayList<Integer> arr,int pages)
    {
        int n=arr.size();
        int students=1;
        long pagesStudent=0;
        for(int i=0;i<n;i++)
        {
            if(pagesStudent+arr.get(i)<=pages)
            {
                pagesStudent+=arr.get(i);
            }
            else{
                students++;
                pagesStudent=arr.get(i);
            }
        }
        return students;
    }
    
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m>n) return -1;
        int low=Collections.max(arr);
        int high=arr.stream().mapToInt(Integer::intValue).sum();
        while(low<=high)
        {
            int mid=(low+high)/2;
            int students=countStudents(arr, mid);
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
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        return findPages(boards, boards.size(), k);
    }
}
