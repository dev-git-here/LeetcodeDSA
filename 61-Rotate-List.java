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
    public ListNode rotateRight(ListNode head, int k) {

        ListNode tail = head;
        ListNode ptr = head;
        int count = 1;

        if (head == null || head.next == null) {
            return head;
        }

        while (tail.next != null) {
            tail = tail.next;
            count++;
        }


        k = k % count;
        if (k == 0) {
            return head;
        }
        tail.next = head;
         

        for (int i = 0; i < count-k; i++) {
            ptr = ptr.next;
        }
        
        tail = ptr;

        while (tail.next != ptr) {
            tail = tail.next;
        }

        tail.next = null;
        head = ptr;

        return head;

        
    }
}