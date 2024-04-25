class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int max=0;
        int maxLen=0;
        int [] arr=new int [26];
        while(r<s.length())
        {
            arr[s.charAt(r)-'A']++;
            max=Math.max(max,arr[s.charAt(r)-'A']);
            if(r-l+1-max>k)
            {
                arr[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
        
        
    }
}
