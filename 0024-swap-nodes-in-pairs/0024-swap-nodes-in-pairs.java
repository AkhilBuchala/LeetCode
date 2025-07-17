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
    public ListNode swapPairs(ListNode head) {

        ListNode curr = head;

        while (curr != null && curr.next != null){

            if(curr.next != null) {
                int tempa = curr.val ;
                int tempb = curr.next.val;

                curr.val = tempb;
                curr.next.val = tempa;
            }
            curr = curr.next.next;
        }

       
        return head;
        
    }
}