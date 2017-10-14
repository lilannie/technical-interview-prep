package technicalProblems.arrays;

public class sortOddDescEvenAsc {
    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                arr[i] = -arr[i];
        }

        return arr;
    }
}
