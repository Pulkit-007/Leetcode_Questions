
class Job{
    int id, profit, deadline;
    Job(int x, int y) {
      this.deadline = x;
      this.profit = y;
   }
}
class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n=deadline.length;
        Job [] arr=new Job[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new Job(deadline[i],profit[i]);
            
        }
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        int maxi=0;
        for (int i = 0; i < n; i++) {
        if (arr[i].deadline > maxi) {
            maxi = arr[i].deadline;
         }
      }

        int result[] = new int[maxi + 1];

        for (int i = 1; i <= maxi; i++) {
         result[i] = -1;
      }

      int countJobs = 0, jobProfit = 0;

      for (int i = 0; i < n; i++) {

         for (int j = arr[i].deadline; j > 0; j--) {

            // Free slot found 
            if (result[j] == -1) {
               result[j] = i;
               countJobs++;
               jobProfit += arr[i].profit;
               break;
            }
         }
      }
      ArrayList<Integer> ans=new ArrayList<>();
      ans.add(countJobs);
      ans.add(jobProfit);
      return ans;
        
        
    }
}
