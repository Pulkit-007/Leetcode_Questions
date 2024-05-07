import java.util.* ;
import java.io.*; 

public class Solution {
  public static int Ceil(int [] a,int n,int x)
  {
    int low=0;
    int high=n-1;
    int ans=-1;
    while(low<=high)
    {
      int mid=(low+high)/2;
      if(a[mid]>=x)
      {
        ans=a[mid];
        high=mid-1;
      }
      else
      {
        low=mid+1;
      }
    }
    return ans;
  }
  public static int Floor(int [] a,int n,int x)
  {
    int low=0;
    int high=n-1;
    int ans=-1;
    while(low<=high)
    {
      int mid=(low+high)/2;
      if(a[mid]<=x)
      {
        ans=a[mid];
        low=mid+1;
      }
      else{
        high=mid-1;
      }
    }
    return ans;
  }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here. 
      int [] res=new int[2];
      res[0]=Floor(a,n,x);
      res[1]=Ceil(a,n,x);
      return res;
    }
    
}
