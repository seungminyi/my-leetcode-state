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
        if(head == null) return head;
        Node curr = head;
        
        while(curr != null) {
            Node node = new Node(curr.val);
            node.next = curr.next;
            curr.next = node;
            curr = node.next;
        }
        
        curr = head;
        
        while(curr != null) {
            if(curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        
        curr = head;
        Node copyHead = head.next;
        Node copy = copyHead;
        while (curr != null) {
            curr.next = curr.next.next;
            copy.next = copy.next == null ? null : copy.next.next;
            curr = curr.next;
            copy = copy.next;
        }
        
        return copyHead;
    }
}