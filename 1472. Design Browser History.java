class BrowserHistory {
    public class Node{
        String url;
        Node next, prev;
        public Node(String url) {
            this.url = url;
            next = null;
            prev = null;
        }
    }
    
    Node current;

    public BrowserHistory(String homepage) {
        current =new Node(homepage);
        
        
    }
    
    public void visit(String url) {
        Node newNode=new Node(url);
        current.next=newNode;
        newNode.prev=current;
        current=newNode;
        
    }
    
    public String back(int steps) {
        while(current.prev!=null && steps-->0)
        {
            current=current.prev;
        }
        return current.url;
        
    }
    
    public String forward(int steps) {
        while(current.next!=null && steps-->0)
        {
            current=current.next;
        }
        return current.url;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
