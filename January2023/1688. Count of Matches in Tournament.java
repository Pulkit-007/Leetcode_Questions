class Solution {
    public int numberOfMatches(int n) {
        int count=0;
        int match=0;
        int adv=0;
        while(n!=1)
        {
        if(n%2==0)
        {
            match=n/2;
            adv=n/2;
            n=adv;
            count+=match;
        }
        else
        {
            match=(n-1)/2;
            adv=(n-1)/2+1;
            n=adv;
            count+=match;
        }
        }
        return count;
        
    }
}
