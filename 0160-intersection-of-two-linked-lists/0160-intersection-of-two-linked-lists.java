/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> store = new HashSet<>() ;
        
        while(headB != null ) {
            store.add(headB);
            headB = headB.next;
        }
        
        while(headA != null) {
            if(store.contains(headA)) {
                return headA;
            } 
            headA = headA.next;
        }
        
        return null;

     
    }
}