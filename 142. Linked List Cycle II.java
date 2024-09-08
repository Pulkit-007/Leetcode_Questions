/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Map <ListNode,Integer> map=new HashMap<>();
        // ListNode temp=head;
        // while(temp!=null)
        // {
        //     if(map.containsKey(temp)==true)
        //     {
        //         return temp;
        //     }
        //     map.put(temp,1);
        //     temp=temp.next;
        // }
        // return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                slow=head;
                while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
        
    }
}
