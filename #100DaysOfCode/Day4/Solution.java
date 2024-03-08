class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Solution {
    public static Node reverseDLL(Node head) {
        Node temp = head;
        Node prev = null;
        Node next = null;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            temp.prev = next;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    public static void main( String[] args ) {
       
        Node head = new Node(3);
        head.next = new Node(4);
        head.next.prev = head;
        head.next.next = new Node(5);
        head.next.next.prev = head.next;
        head = reverseDLL(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

}


