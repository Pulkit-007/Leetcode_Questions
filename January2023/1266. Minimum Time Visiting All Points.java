class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sec=0;
        int n=points.length-1;
        for(int i=0;i<n;i++)
        {
            int xdiff=Math.abs(points[i][0]-points[i+1][0]);
            int ydiff=Math.abs(points[i][1]-points[i+1][1]);

        if(xdiff<ydiff)
        {
            sec+=xdiff;
            sec+=ydiff-xdiff;
        }
        else
        {
            sec+=ydiff;
            sec+=xdiff-ydiff;
        }    
        }
        return sec;
        
    }
}
