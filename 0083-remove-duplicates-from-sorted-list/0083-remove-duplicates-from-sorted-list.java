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
       ListNode fst=h.next;
       ListNode sec = h;

       while(fst!=null)
       {
        if(fst.val!=sec.val)
        {
            sec.next=fst;
            sec=fst;
        }
        fst=fst.next;
       }
       sec.next=null;
       return h;

       
        
    }
}