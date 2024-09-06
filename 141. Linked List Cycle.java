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
    public boolean hasCycle(ListNode head) {
    //     ListNode temp=head;
    //     Map<ListNode,Integer> map=new HashMap<>();
    //     while(temp!=null)
    //     {
    //         if(map.containsKey(temp))
    //         {
    //             return true;
    //         }
    //         map.put(temp,1);
    //         temp=temp.next;
    //     }
    //     return false;
        
    // }
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
            return true;
        }
        
    }
    return false;
}
}
