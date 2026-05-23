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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
         ListNode p=null;
          ListNode c=slow;
          while(c!=null){
             ListNode n=c.next;
             c.next=p;
             p=c;
             c=n;
          }
           ListNode t=head;
           while(p!=null){
            if(t.val!=p.val){
                return false;
            }
            p=p.next;
            t=t.next;
           }
           return true;
    }
}