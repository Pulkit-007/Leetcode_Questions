class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
        int row=image.length;
        int col=image[0].length;
        int [][] ans=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                ans[i][j]=image[i][col-j-1];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(ans[i][j]==1)
                {
                    ans[i][j]=0;
                }
                else
                {
                    ans[i][j]=1;
                }
            }
        }
        return ans;



        
    }
}
