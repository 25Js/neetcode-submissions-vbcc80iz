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
       // Create a dummy node to act as the start of the merged list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Iterate while both lists have remaining nodes
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // If one list is exhausted, append the remainder of the other list
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        // The actual head of the merged list is next to the dummy node
        return dummy.next;
    }
}