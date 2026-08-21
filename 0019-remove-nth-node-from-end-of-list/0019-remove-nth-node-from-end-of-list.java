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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int total = 0;
        ListNode temp = head;
        while(temp != null){
            total++;
            temp = temp.next;
        }

        if (n == total){
            return head.next;
        }

        ListNode prev = null;
        temp = head;
        int index = 1;
        while (index != total - n + 1){
            prev = temp;
            temp = temp.next;
            index++;
        }
        prev.next = temp.next;
        return head;
    }
}