/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;
        Node NewList = map.get(head);
        while (temp != null){
            NewList.next = map.get(temp.next);
            NewList.random = map.get(temp.random);
            temp = temp.next;
            NewList = NewList.next;
        }

        return map.get(head);
    }
}