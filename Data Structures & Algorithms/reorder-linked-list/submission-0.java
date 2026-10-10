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

      ListNode temp=head;
      Stack<Integer>s=new Stack<>();
      while(temp!=null)
      {
         s.push(temp.val);
         temp=temp.next;
      }
      temp=head;
      List<Integer>list=new ArrayList<>();
      while(temp!=null)
      {
        list.add(temp.val);
         list.add(s.peek());
         s.pop();
         
         temp=temp.next;
      }
      temp=head;
      int i=0;
      while(temp!=null && i<list.size())
      {
        temp.val=list.get(i);
        i++;
        temp=temp.next;
      }
      return ;
    }
}
