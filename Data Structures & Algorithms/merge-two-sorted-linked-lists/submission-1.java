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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=list1;
        List<Integer>list=new ArrayList<>();
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        temp=list2;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);

        ListNode curr=new ListNode();
        ListNode head=curr;
        for(int num:list)
        {
            head.next=new ListNode(num);
            head=head.next;
        }
        return curr.next;
    }
}