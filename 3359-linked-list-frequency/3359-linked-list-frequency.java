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
    public ListNode frequenciesOfElements(ListNode head) {
        HashMap<Integer,Integer> store = new HashMap<>();

        while(head != null) {
            int key = head.val;
            if(store.containsKey(key)) {
                int val = store.get(key);
                store.put(key,val+1);
            } else {
                store.put(key,1);
            } 
            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(Integer value : store.values()) {
            curr.next = new ListNode(value);
            curr = curr.next;
        }

        return dummy.next;

    }
}