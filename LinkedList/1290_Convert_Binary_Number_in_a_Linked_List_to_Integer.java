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
    public int getDecimalValue(ListNode head) {
        int length = getSize(head);
        int[] binary = new int[length];

        ListNode temp_head = head;
        int count = 0;
        while (temp_head != null) {
            binary[count] = temp_head.val;
            temp_head = temp_head.next;
            count++;
        }

        int ans = 0;
        int len = length - 1;
        for (int i = len; i >= 0; i--) {
            if (binary[length - i - 1] == 1) {
                int temp = getNum(i);
                ans += temp;
            }
        }
        return ans;
    }

    public int getNum(int i) {
        if (i == 0) {
            return 1;
        }
        int ans = 1;
        for (int idx = 0; idx < i; idx++) {
            ans = ans * 2;
        }
        return ans;
    }

    public int getSize(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
}