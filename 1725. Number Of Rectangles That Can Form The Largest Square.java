class Solution {
    public int countGoodRectangles(int[][] rectangles) 
    {
        int max=0,cnt=0;
        int [] res=new int[rectangles.length];
        for(int i=0;i<rectangles.length;i++)
        {
            res[i]=Math.min(rectangles[i][0],rectangles[i][1]);
            max=Math.max(res[i],max);
        }
        for(int i=0;i<res.length;i++)
        {
            if(res[i]==max)
            {
                cnt++;
            }
        }
        return cnt;
        
        
    }
}
