package technicalProblems.lists;

import dataStructures.SinglyLinkedList;

/**
 *
 Problem:
 Given a linked list, write a function to reverse every k nodes (where k is an input to the function). If the linked list is given as 1→ 2 → 3 → 4 → 5 → 6 → 7→ 8 → NULL and k = 3 then output will be 3 → 2 → 1 → 6 → 5 → 4 → 8 → 7 → NULL

 Input:
 Takes two arguments: the head of the linked list and int k. You should not read any input from stdin/console.
 The struct Node has a data part which stores the data and a next pointer which points to the next element of the linked list. There are multiple test cases. For each test case, this method will be called individually.

 Output:
 Reverse the linked list in the group of given size and return the reference of starting node (head) of the reversed Linked list.

 Example:
 Input:
 1
 8
 1 2 2 4 5 6 7 8
 4
 Output:
 4 2 2 1 8 7 6 5

 */
public class reverseLinkedListInGroups {
    Node iterationMethod(Node head, int k) {
        Node current = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        // Reverse first k nodes of linked list
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        /* next is now a pointer to (k+1)th node
          Recursively call for the list starting from current.
          And make rest of the list as next of first node */
        if (next != null)
            head.next = iterationMethod(next, k);

        // prev is now head of input list
        return prev;
    }
}