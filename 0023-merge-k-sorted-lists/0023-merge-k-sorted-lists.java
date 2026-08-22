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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode n1, ListNode n2){
                return n1.val - n2.val;
            }
        });
        ListNode temp;
        ListNode result = new ListNode();

        for (ListNode list : lists){
            temp = list;
            while (temp != null){
                q.offer(temp);
                temp = temp.next;
            }
        }

        temp = result;
        while (temp != null){
            temp.next = q.poll();
            temp = temp.next;
        }

        return result.next;
    }
}