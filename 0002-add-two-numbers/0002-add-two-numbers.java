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
    public int calc(int a, int b, int[] carry){
        int sum = a + b + carry[0];
        carry[0] = 0;
        if (sum > 9){
            sum = sum % 10;
            carry[0] = 1;
        }
        return sum;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode l3 = new ListNode();
        ListNode t3 = l3;
        int[] carry = new int[1];

        while (t1 != null && t2 != null){
            t3.next = new ListNode(calc(t1.val, t2.val, carry));
            t3 = t3.next;
            t1 = t1.next;
            t2 = t2.next;
        }
        while (t1 != null){
            t3.next = new ListNode(calc(t1.val, 0, carry));
            t3 = t3.next;
            t1 = t1.next;
        }
        while (t2 != null){
            t3.next = new ListNode(calc(t2.val, 0, carry));
            t3 = t3.next;
            t2 = t2.next;
        }
        if (carry[0] == 1){
            t3.next = new ListNode(1);
        }

        return l3.next;
    }
}