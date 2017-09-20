package technicalProblems.arrays;

/*
http://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 */

import util.Printing;

public class dutchFlagProblem {
    static int[] sortArray(int[] arr) {
        int mid = 0;
        int begin = 0;
        int last = arr.length -1;

        while (mid <= last) {
            switch (arr[mid]) {
                case 0: {
                    swap(arr, begin, mid);
                    mid++;
                    begin++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    swap(arr, mid, last);
                    last--;
                    break;
                }
            }
        }

        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Printing.printArray(sortArray(new int[]{0, 2, 1, 0, 2}));
        Printing.printArray(sortArray(new int[]{0, 0, 1, 0, 2}));
        Printing.printArray(sortArray(new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}));
    }
}
