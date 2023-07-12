class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>  ll=new ArrayList<>();
        Parenthesis(n,0,0,"",ll);
        return ll;
         
    }
    public static void Parenthesis(int n,int open,int close,String ans,List<String> ll)
    {
        if(open==n && close==n)
        {
            ll.add(ans);
            return;
        }
        if(open<n)
        {
            Parenthesis(n,open+1,close,ans+"(",ll);
        }
        if(close<open)
        {
            Parenthesis(n,open,close+1,ans+")",ll);
        }
    }
}
