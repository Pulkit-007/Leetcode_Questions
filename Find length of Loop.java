/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static int FindLength(Node slow,Node fast)
    {
        int cnt=1;
        fast=fast.next;
        while(slow!=fast)
        {
            cnt++;
            fast=fast.next;
            
        }
        return cnt;
    }
    public static int lengthOfLoop(Node head) {
        // Write your code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                return FindLength(slow,fast);
            }
        }
        return 0;
    }
}
