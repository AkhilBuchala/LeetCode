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
    public ListNode partition(ListNode head, int x) {
        ListNode anode = new ListNode(0);
        ListNode bnode = new ListNode(0);

        ListNode a = anode;
        ListNode b = bnode;
        ListNode temp = head;

        while(temp != null ) {
            if(temp.val < x) {
                a.next = temp;
                a = temp ;
            } else {
                b.next = temp;
                b = temp;
            }

            temp = temp.next;
        }

        a.next = bnode.next;
        b.next = null;

        return anode.next;
    }
}