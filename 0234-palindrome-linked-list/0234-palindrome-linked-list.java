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
        ArrayList<Integer> store = new ArrayList<>();

        while(head != null ) {
            int val = head.val;
            store.add(val);
            head = head.next;
        }

        int start = 0;
        int end = store.size() - 1;

        while(start<end) {
            if(store.get(start) != store.get(end)){
                return false;
            }
            start ++;
            end --;
        }

        return true;
            
                    
    }
}