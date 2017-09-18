package code_fights;

import dataStructures.ListNode;

public class linkedListsRemoveEqualaventElements {
// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
    ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        ListNode<Integer> head = l;
        ListNode<Integer> prev = null;
        ListNode<Integer> curr = l;

        while (curr != null) {
            ListNode<Integer> next = curr.next;

            if (curr.value == k) {
                if (curr == head) {
                    head = curr.next;
                }
                if (prev != null) {
                    prev.next = next;
                }

                curr.next = null;
            }
            else {
                prev = curr;
            }

            curr = next;
        }

        return head;
    }

}
