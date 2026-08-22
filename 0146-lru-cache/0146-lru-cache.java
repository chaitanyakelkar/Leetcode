class Node {
    public int key;
    public int value;
    public Node next;
    public Node prev;

    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    int capacity;
    HashMap<Integer, Node> map;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        deleteNode(node);
        insertAfterHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            insertAfterHead(node);
        } else {
            if (map.size() == capacity){
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            insertAfterHead(node);
        }
    }

    private void deleteNode(Node node){
        Node next = node.next;
        Node prev = node.prev;
        prev.next = next;
        next.prev = prev;
    }

    private void insertAfterHead(Node node){
        Node next = head.next;
        head.next = node;
        node.next = next;
        next.prev = node;
        node.prev = head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */