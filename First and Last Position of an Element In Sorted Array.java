import java.util.* ;
import java.io.*; 
public class Solution {
    public static int First(ArrayList<Integer> arr,int n,int x)
    {
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr.get(mid)==x)
            {
                first=mid;
                high=mid-1;
            }
            else if(arr.get(mid)<x)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }

    public static int Last(ArrayList<Integer> arr,int n, int x)
    {
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr.get(mid)==x)
            {
                last=mid;
                low=mid+1;
            }
            else if(arr.get(mid)<x)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }


    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int x) {
        // Write your code here.
        int [] res=new int [2];
        res[0]=First(arr,n,x);
        res[1]=Last(arr,n,x);
        return res;
    }

};
