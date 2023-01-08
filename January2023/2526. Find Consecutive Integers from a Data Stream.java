class DataStream {
    int v=0;
    int kc=0;
    int c=0;

    public DataStream(int value, int k) {
        v=value;
        kc=k;
        
        
    }
    
    public boolean consec(int num) {
        if(v==num)
            c++;
        else
            c=0;
        return c>=kc;
        
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
