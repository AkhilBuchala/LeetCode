/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node head) {

        int size = 0;

        Node curr = head;
        while(curr != null ) {
            size ++;
            curr = curr.next;
        }

        int[] result =  new int[size];

        Node temp = head;
        int index = 0;
        while(temp!= null) {
            result[index] = temp.val;
            index ++;
            temp = temp.next;
        }

        return result;
        
    }
}