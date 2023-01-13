class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        for(int i=1;i<n;i++)
        {
            int leftsum=i*(i+1)/2;
            int rightsum=n*(n+1)/2-i*(i-1)/2;
            if(leftsum==rightsum) return i;
        }
        return -1;

        
    }
}
