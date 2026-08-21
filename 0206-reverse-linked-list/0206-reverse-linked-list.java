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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        // ListNode dummy = new ListNode(-1);
        // dummy.next = head;
        ListNode prev = head;
        ListNode temp = prev.next;
        ListNode front = temp.next;

        head.next = null;

        while(front!=null){
            temp.next = prev;
            prev = temp;
            temp = front;
            front = front.next;
        }
        
        temp.next = prev;

        return temp;
    }
}