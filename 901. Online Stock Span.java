class StockSpanner {
    // List<Integer> arr;
     Stack<int[]> st;

    public StockSpanner() {
        // arr=new ArrayList<>();
        st = new Stack<>();
    }
    
    public int next(int price) {
        // arr.add(price);
        // int cnt=1;
        // for(int i=arr.size()-2;i>=0;i--)
        // {
        //     if(arr.get(i)<=price)
        //     {
        //         cnt++;
        //     }
        //     else
        //     {
        //         break;
        //     }
        // }
        // return cnt;
         int span = 1;
        
        while(st.size() > 0 && price >= st.peek()[0]){
            span += st.pop()[1];
        }
        
        st.push(new int[]{price, span});
        
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
