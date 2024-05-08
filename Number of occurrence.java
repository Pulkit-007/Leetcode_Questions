public class Solution {
    public static int First(int [] arr,int n,int x)
    {
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }

    public static int Last(int [ ] arr,int n, int x)
    {
        int low=0;
        int high=n-1;
        int last=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }




    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int [] res=new int [2];
        res[0]=First(arr,n,x);
        res[1]=Last(arr,n,x);
        if (res[0] == -1) return 0;
        return (res[1]-res[0]+1);
    }
}
