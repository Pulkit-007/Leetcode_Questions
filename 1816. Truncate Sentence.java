class Solution {
    public String truncateSentence(String s, int k) {
        String ans="";
        String arr[]=s.split(" ");
        for(int i=0;i<k;i++)
        {
            ans+=arr[i]+" ";
        }
        return ans.trim();
        
    }
}
