package util;

import java.util.Iterator;
import java.util.LinkedList;

public class Printing {

    public static void printArray(int[] arr) {
        for (int element: arr) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void printLinkedList(LinkedList<Integer> list) {
        for (Object item : list) {
            System.out.print(item + " -> ");
        }

        System.out.println();
    }
}