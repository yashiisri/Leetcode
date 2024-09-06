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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle of the list
        ListNode mid = middleNode(head);

        // Step 2: Reverse the second half of the list
        ListNode hs = reverseList(mid);

        // Step 3: Merge the two halves
        ListNode hf = head;

        while (hf != null && hs != null) {
            ListNode temp1 = hf.next;  // Temporarily store next node of first half
            ListNode temp2 = hs.next;  // Temporarily store next node of second half

            hf.next = hs;  // Link current node of first half to the head of second half
            hf = temp1;    // Move to the next node in the first half

            hs.next = hf;  // Link current node of second half to the next node of first half
            hs = temp2;    // Move to the next node in the second half
        }

        // Ensure the list ends correctly by setting the next of the last node to null
        if (hf != null) {
            hf.next = null;
        }
    }

    // Function to reverse a linked list
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }

    // Function to find the middle of the list
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
