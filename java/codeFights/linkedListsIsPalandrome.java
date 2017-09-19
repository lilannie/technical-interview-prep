package codeFights;

import dataStructures.ListNode;

public class linkedListsIsPalandrome {

    // Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
    boolean isListPalindrome(ListNode<Integer> l) {
        ListNode<Integer> curr = l;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        if (count <= 1)
            return true;

        int firstHalf = count/2;

        ListNode<Integer> prev = null;
        ListNode<Integer> next = null;
        curr = l;

        while (firstHalf > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            firstHalf--;
        }


        l.next = next;

        ListNode<Integer> lastHalf = count % 2 == 0 ? next : next.next;


        for (int i = 0; i < count/2; i++) {
            if ((int)prev.value != (int)lastHalf.value) {
                System.out.println(prev.value);
                System.out.println(lastHalf.value);
                return false;
            }

            prev = prev.next;
            lastHalf = lastHalf.next;
        }

        return true;
    }

}
