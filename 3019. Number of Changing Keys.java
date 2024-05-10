class Solution {
    public int countKeyChanges(String s) {
        int cnt=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.toLowerCase().charAt(i)==s.toLowerCase().charAt(i+1))
            {
                continue;
            }
            cnt++;
        }
        return cnt;
        
    }
}
