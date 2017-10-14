package algorithms.Sorting;

import util.Printing;

public class QuickSort {
    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int part = partition(arr, low, high);
            quickSort(arr, low, part);
            quickSort(arr, part + 1, high);
        }

        return arr;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int leftwall = low;

        for (int i = low + 1; i < high; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[leftwall];
                arr[leftwall] = temp;

                leftwall = leftwall + 1;
            }
        }

        return pivot;
    }

    public static void main(String[] args) {
        Printing.printArray(quickSort(new int[]{4, 3, 9, 2, 0, 1}, 1, 6));
    }
}
