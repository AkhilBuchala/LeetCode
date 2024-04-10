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
    public String gameResult(ListNode head) {
        int odd = 0;
        int even = 0;
        ListNode current = head;
        
        while(current != null && current.next != null ) {
            int evenIndexValue = current.val;
            int oddIndexValue = current.next.val;
            System.out.println(oddIndexValue);
            
            if(evenIndexValue>oddIndexValue) even++;
            if(evenIndexValue<oddIndexValue) odd++;
            
            current = current.next.next;
       
        }
        
        if(even == odd) {
            return "Tie";
        } 
        else if(even < odd) {
            return "Odd";
        } else {
            return "Even";
        }
        
        
    }
}