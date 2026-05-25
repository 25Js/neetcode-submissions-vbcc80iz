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
    public ListNode removeNthFromEnd(ListNode head, int n) {
          ListNode temp= head;
          int s=0;
          if(head==null ){
            return head;
          }
          while(temp!=null){
             s++;
             temp=temp.next;
          }
                  if(s == n){
            return head.next;
        }

          int f=s-n;
          int i=1;
          ListNode r=head;
         
        for( i = 1; i < f; i++){
            r = r.next;
        }
          r.next=r.next.next;

          return head;

    }
}
