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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> store = new Stack<>();
        ListNode curr = head;
        
        while(curr!=null) {
            store.push(curr);
            curr=curr.next;
        }
        
        curr = store.pop();
        int max = curr.val;
        ListNode result = new ListNode(max);
        
      
        
        while (!store.isEmpty()) {
            curr = store.pop();
            if(curr.val<max) {
                continue;
            } else {
                ListNode newNode = new ListNode(curr.val);
                newNode.next = result;
                max= curr.val;
                result = newNode;
            }
        }
        
        return result;
        
    }
}