package essentialBasics;

import dataStructures.ListNode;

public class reverseSinglyLinkedList {
    public ListNode<Integer> reverse(ListNode<Integer> l) {
        ListNode<Integer> prev = null;
        ListNode<Integer> next = null;
        ListNode<Integer> curr = l;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
