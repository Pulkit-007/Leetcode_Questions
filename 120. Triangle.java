class Solution {
    public static int f(int i,int j, List<List<Integer>> triangle,int n,int [][] dp)
    {
        if(i==triangle.size()-1) return triangle.get(n-1).get(j);
        if(dp[i][j]!=-1) return dp[i][j];
        int down= triangle.get(i).get(j)+ f(i+1,j,triangle,n,dp);
        int diagonal=triangle.get(i).get(j)+f(i+1,j+1,triangle,n,dp);
        return dp[i][j]=Math.min(down,diagonal);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int [][]dp=new int[n][n];
        for(int []r:dp)
        {
            Arrays.fill(r,-1);
        }
        return f(0,0,triangle,n,dp);
        
    }
}
