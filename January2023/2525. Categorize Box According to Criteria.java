class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        String ans="";
        String cat=" ";
        long Vol=1;
        Vol=Vol*height;
        Vol=Vol*length;
        Vol=Vol*width;
        if(length >=10000 || width >=10000 || height >=10000 )
        {
            ans="Bulky";
        }
        else if(Vol>=1000000000)
        {
            ans="Bulky";
        }
        if(mass>=100)
        {
            ans="Heavy";
        }
        if(length >=10000 || width >=10000 || height >=10000 || Vol>=1000000000)
        {
            if(mass>=100){
            ans="Bulvy";
            }
        }
        if(ans=="Bulvy")
        {
            cat="Both";
        }
        else if(ans=="Bulky")
        {
            cat="Bulky";
        }
        else if(ans=="Heavy")
        {
            cat="Heavy";
        }
        else 
        {
            cat="Neither";
        }
        return cat;
        
    }
}
