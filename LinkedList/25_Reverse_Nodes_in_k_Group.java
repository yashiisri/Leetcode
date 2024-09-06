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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {  // Corrected head == null
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while (true) {
            // Check if there are at least k nodes left to reverse
            ListNode check = current;
            for (int i = 0; i < k; i++) {
                if (check == null) {
                    return head;
                }
                check = check.next;
            }

            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;

            // Reverse k nodes
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            // Connect the last part to the reversed list
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            if (current == null) {
                break;
            }

            prev = newEnd;  // Move prev to the newEnd for the next group
        }

        return head;
    }
}
