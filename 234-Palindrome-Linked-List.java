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

    ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newNode = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newNode;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode middleElement = middleNode(head);
        ListNode newHead = reverse(middleElement.next);
        ListNode temp = head;


        while (newHead != null) {
            if (temp.val != newHead.val) {
                reverse(newHead);
                return false;
            }

            temp = temp.next;
            newHead = newHead.next;
        }

        reverse(newHead);
        return true;

    }
}