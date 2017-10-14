package algorithms.Searching;

import java.lang.reflect.Array;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x, int begin, int end) {
        if (begin == end) return Integer.MIN_VALUE;

        int middle = (end-begin)/2 + begin;

        if (x == arr[middle]) return arr[middle];

        else if (x > arr[middle]) {
            return binarySearch(arr, x, middle+1, end);
        }

        else if (x < arr[middle]) {
            return binarySearch(arr, x, begin, middle-1);
        }

        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr, 2, 0, arr.length));
        System.out.println(binarySearch(arr, 4, 0, arr.length));
        System.out.println(binarySearch(arr, 10, 0, arr.length));
    }
}
