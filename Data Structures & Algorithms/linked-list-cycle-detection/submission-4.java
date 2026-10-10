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
    public boolean hasCycle(ListNode head) {
        ListNode helper=head;
        ListNode checker=head;
        
        while(checker!=null && checker.next!=null)
        {
            checker=checker.next.next;
            if(helper==checker)
            {
            return true;
            
            }
            
                helper=helper.next;
            
            
        }
        return false;
        
    }
}
