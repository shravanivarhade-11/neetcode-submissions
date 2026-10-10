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
    public void reorderList(ListNode head) {
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        int p = 0;
        int q = list.size()-1;
        List<Integer> list1 = new ArrayList<>();
       for (int i = 0; i < list.size(); i++) {
    if (i % 2 == 0) {
        list1.add(list.get(p));
        p++;
    } else {
        list1.add(list.get(q));
        q--;
    }
}
     
        curr=head;;

        for (int i = 0; i < list1.size(); i++) {
            curr.val=list1.get(i);
            curr=curr.next;
        }
        
    }
}
