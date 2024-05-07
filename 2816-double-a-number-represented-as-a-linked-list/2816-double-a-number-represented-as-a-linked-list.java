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
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr!=null) {
            int twice = curr.val * 2;
            
            if(twice<10) {
                curr.val = twice;
            } else if(prev != null ) {
                curr.val = twice%10;
                prev.val = prev.val +1;
            } else {
                head = new ListNode(1,curr);
                curr.val = twice%10;
            }
            
            prev = curr;
            curr = curr.next;
        }
        
        return head;
    
    }
}