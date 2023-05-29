class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans=new ArrayList<>();
        int minr=0;
        int maxr= arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int totalele= arr.length*arr[0].length;
        int count=0;
        while(count<totalele)
        {
            for (int i = minc; i <= maxc && count<totalele; i++) {
                //System.out.print(arr[minr][i] + " ");
                ans.add(arr[minr][i]);
                count++;

            }
            minr++;
            for (int i = minr; i <= maxr && count<totalele; i++) {
                //System.out.print(arr[i][maxc] + " ");
                ans.add(arr[i][maxc]);
                count++;

            }
            maxc--;
            for (int i = maxc; i >= minc && count<totalele; i--) {
                //System.out.print(arr[maxr][i] + " ");
                ans.add(arr[maxr][i]);
                count++;

            }
            maxr--;
            for (int i = maxr; i >= minr && count<totalele; i--) {
                //System.out.print(arr[i][minc]+" ");
                ans.add(arr[i][minc]);
                count++;

            }
            minc++;
        }
        return ans;


    
        
    }
}
