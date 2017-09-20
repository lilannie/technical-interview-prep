package technicalProblems.lists;

import dataStructures.ListNode;

public class FindNthLastNode {
    static int getNthToLastNode(ListNode<Integer> head, int n) {
        ListNode<Integer> head_start = head;
        ListNode<Integer> nthNode = head;

        int count = n;
        while (head_start != null && count > 0) {
            head_start = head_start.next;
            count--;
        }

        if (count > 0)
            return -1;

        while (head_start != null) {
            head_start = head_start.next;
            nthNode = nthNode.next;
        }

        return nthNode.value;
    }
}