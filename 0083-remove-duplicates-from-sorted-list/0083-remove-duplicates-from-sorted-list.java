/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode h) {
        if(h==null)
        {
            return null;
        }
        ListNode s=h;
        ListNode f =h.next;

        while(f!=null )
        {
            if(f.val!=s.val)
            {
                s.next=f;
                s=f;
            }

            f=f.next;
        }
        s.next=null;
        return h;
        
    }
}