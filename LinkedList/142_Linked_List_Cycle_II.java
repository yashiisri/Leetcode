/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int lengthCycle(ListNode slow) {
        ListNode temp = slow;
        int length = 0;
        do {
            temp = temp.next;
            length++;
        } while (temp != slow);
        return length;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        // First, detect if there is a cycle in the list.
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            // If fast and slow meet, there's a cycle.
            if (fast == slow) {
                length = lengthCycle(slow);  // Find the length of the cycle.
                break;
            }
        }

        // If there's no cycle, return null.
        if (length == 0) {
            return null;
        }

        // Find the starting node of the cycle.
        ListNode first = head;
        ListNode second = head;

        // Move second ahead by 'length' nodes.
        while (length > 0) {
            second = second.next;
            length--;
        }

        // Move both pointers until they meet; this will be the start of the cycle.
        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return first;  // The starting node of the cycle.
    }
}
    
