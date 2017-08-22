package technicalProblems.arrays;

import util.Printing;

/**

 Problem:
 Given an array, print k largest elements from the array. The output elements should be printed in decreasing order

 Input:
 The first line of input contains an integer T denoting the number of test cases.
 The first line of each test case is N and k where N is the size of the array and K is the largest elements to be returned.
 The second line of each test case contains N input C[i]

 Output:
 Print the k largest element in descending order

 Constraints:
 1 <= T <= 100
 1 <= N <= 100
 K <= N
 1 <= C[i] <= 1000

 */
public class KLargestElements {

    public static void main(String args[]) {
        int[] arr = { 12, 5, 787, 1, 23 };
        int k = 2;
        findKLargest(arr, k);

        arr = new int[]{ 1, 23, 12, 9, 30, 2, 50 };
        k = 3;
        findKLargest(arr, k);
    }

    public static void findKLargest(int arr[], int k) {
        bubbleSortMethod(arr, k);

        System.out.print("After bubble sorting:");
        Printing.printArray(arr);

        System.out.println("K Largest:");
        for (int i = arr.length -1; i > arr.length - 1 - k; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void bubbleSortMethod(int arr[], int k) {
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}