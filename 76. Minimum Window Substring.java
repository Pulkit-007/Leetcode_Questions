class Solution {
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        int minLen=Integer.MAX_VALUE;
        int sIndex=-1;
        int cnt=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        while(r<s.length())
        {
            if(map.getOrDefault(s.charAt(r),0)>0)
            {
                cnt++;
            }
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)-1);
            while(cnt==t.length())
            {
                if(r-l+1<minLen)
                {
                    minLen=r-l+1;
                    sIndex=l;
                }
                map.put(s.charAt(l),map.get(s.charAt(l))+1);
                if(map.get(s.charAt(l))>0)
                {
                    cnt--;
                }
                l++;
            }
            r++;
        }
        return sIndex==-1? "":s.substring(sIndex,sIndex+minLen);
        
    }
}
