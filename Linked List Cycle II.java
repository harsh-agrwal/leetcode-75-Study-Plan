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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null)return null;
        if (head.next == null)return null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)break;
        }
        if (slow != fast)return null;
        slow = head;
        if (slow == fast)return slow;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.next;
    }
}
