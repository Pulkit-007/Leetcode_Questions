class Solution {
    public boolean squareIsWhite(String coordinates) {
        if(coordinates.charAt(0)%2==0 && coordinates.charAt(1)%2!=0) return true;
        else if(coordinates.charAt(0)%2!=0 && coordinates.charAt(1)%2==0) return true;
        else
        return false;
        
    }
}
