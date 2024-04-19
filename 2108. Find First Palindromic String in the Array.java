class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words)
        {
            String reverse=new StringBuilder(word).reverse().toString();
            if(word.equals(reverse))
            {
                return word;
            }
            
        }

        return "";
        
    }
}
