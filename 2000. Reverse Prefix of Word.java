class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans=new StringBuilder();
        int idx=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                 idx=i;
                
                break;
            }
        }
            ans.append(word.substring(0,idx+1)).reverse();
            ans.append(word.substring(idx+1,word.length()));
        
        return ans.toString();
        
    }
}
