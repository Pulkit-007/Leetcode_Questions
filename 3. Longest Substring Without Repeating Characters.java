class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int l=0,r=0;
        int max=0;
        int idx=0;
        int n=s.length();
        while(r<n){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                l=Math.max(map.get(ch)+1,l);      
        }
            map.put(ch,r);
           max=Math.max(max,r-l+1);
           r++;
            }
            return max;
}
        
        
}
