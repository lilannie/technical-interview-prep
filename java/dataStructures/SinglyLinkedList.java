package dataStructures;

public class SinglyLinkedList {
   public Node head;

    public class Node {
        public int data;
        public Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void print(Node current) {
        while (current != null) {
            System.out.print(current.data+" -> ");
            current = current.next;
        }

        System.out.println("NULL");
    }
}