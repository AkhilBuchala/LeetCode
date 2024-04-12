/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        int count = 0;
        HashMap<ListNode, Integer> store = new HashMap<>();
        
        while(head != null) {
            if(!store.containsKey(head)) {
                store.put(head,count);
            } else {
                return true;
            }
            
            count++;
            head=head.next;
        }
        
        return false;
    }
}