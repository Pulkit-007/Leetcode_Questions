/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        Map<Node,Node> mpp=new HashMap<>();
        while(temp!=null)
        {
            Node newNode=new Node(temp.val);
            mpp.put(temp,newNode);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            Node copynode=mpp.get(temp);
            copynode.next=mpp.get(temp.next);
            copynode.random=mpp.get(temp.random);
            temp=temp.next;
        }
        return mpp.get(head);
        
    }
}
