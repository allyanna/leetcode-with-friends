public class Solution {
    public Node CopyRandomList(Node head) {
        Dictionary<Node, Node> map = new(); 

        if(head == null) return null;

        var copy = new Node(head.val);
        map[head] = copy;
        var cur1 = head.next; 
        var cur2 = copy;

        while(cur1 != null) {
            var next2 = new Node(cur1.val); 
            cur2.next = next2;
            map[cur1] = next2;
            cur1 = cur1.next;
            cur2 = cur2.next; 
        }
        cur1 = head;
        cur2 = copy;

         while(cur2 != null) {
            var random = cur1.random != null 
                ? map[cur1.random]
                : null;
            
            cur2.random = random;
            cur1 = cur1.next;
            cur2 = cur2.next;        
                
        }
        return copy;
    }
}
