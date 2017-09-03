package technicalProblems.stacks;

import util.Printing;

import java.util.Stack;

public class FindNextLargestNumber {

    public static int[] stackMethod(int[] arr) {
        int[] ans = new int[arr.length];
        int stackIndex = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            while (stack.peek() <= arr[i]) {
                if (stackIndex < arr.length) {
                    stack.push(arr[stackIndex]);
                    stackIndex++;
                }
                else {
                    ans[i] = -1;
                    found = true;
                    break;
                }
            }

            if (!found) ans[i] = stack.peek();
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 1, 2};
        Printing.printArray(stackMethod(arr));

        arr = new int[]{ 1, 3, 2, 4};
        Printing.printArray(stackMethod(arr));

    }
}
