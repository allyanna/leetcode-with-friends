public class Node {
    int key;
    int val; 
    Node prev; 
    Node next; 
    public Node(int key, int val) {
        this.key = key; 
        this.val = val; 
        this.prev = null; 
        this.next = null; 
    }
}

public class LRUCache {

    int capacity; 
    Node left; 
    Node right; 
    Dictionary<int, int> cache = new Dictionary<int, int>(); 
    public LRUCache(int capacity) {
        this.capacity = capacity; 
        this.left = new Node(0, 0); 
        this.right = new Node(0,0); 

        left.next = right; 
        right.prev = left; 
    }

    public void insert(Node node) {
        var prev = right.prev; 
        var next = right; 

        next.prev = node; 
        prev.next = next.prev; 
        node.next = next; 
        node.prev = prev
    }
    
    public int Get(int key) {
        
    }
    
    public void Put(int key, int value) {
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.Get(key);
 * obj.Put(key,value);
 */
