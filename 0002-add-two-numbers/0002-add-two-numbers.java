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
    int calc(int a, int b, int[] carry){
        int sum = a + b + carry[0];
        if (sum > 9){
            sum = sum % 10;
            carry[0] = 1;
        } else {
            carry[0] = 0;
        }
        return sum;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode res = new ListNode(0);
        ListNode temp3 = res;
        int[] carry = new int[1];

        temp3.val = calc(temp1.val, temp2.val, carry);
        temp1 = temp1.next;
        temp2 = temp2.next;
        while(temp1 != null && temp2 != null){
            temp3.next = new ListNode(calc(temp1.val, temp2.val, carry));
            temp1 = temp1.next;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        while(temp1 != null){
            temp3.next = new ListNode(calc(temp1.val, 0, carry));
            temp1 = temp1.next;
            temp3 = temp3.next;
        }
        while(temp2 != null){
            temp3.next = new ListNode(calc(temp2.val, 0, carry));
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        if (carry[0] == 1){
            temp3.next = new ListNode(1);
            temp3 = temp3.next;
        }

        return res;
    }
}