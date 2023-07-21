class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.length()==0)
        {
            return res;
        }
        Printanswer(digits,"",res);
        return res;
    }
     static String [] code={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      public static void Printanswer(String que,String ans,List<String> res)
    {
        if(que.length()==0)
        {
            //System.out.println(ans+" ");
            res.add(ans);
            return;
        }
        char ch=que.charAt(0);//2--50
        String press=code[ch-48];//abc
        for(int i=0;i< press.length();i++)
        {
            Printanswer(que.substring(1),ans+press.charAt(i),res);

        }
    }
}
