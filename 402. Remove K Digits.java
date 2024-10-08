class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            while(!st.isEmpty() && k>0 && (st.peek()-'0')>(num.charAt(i)-'0'))
            {
                st.pop();
                k=k-1;
            }
            st.push(num.charAt(i));
        }
        while(k>0)
        {
            st.pop();
            k--;
        }
        if(st.isEmpty())
        {
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.peek());
            st.pop();
        }
        sb.reverse();
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() > 0 ? sb.toString() : "0";
         

        
    }
}
