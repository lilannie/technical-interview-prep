package technicalProblems.dynamicProgramming;

public class subarrayWIthGivenSum {

    // O(n^2)
    static void findSubarrayDP(int[] arr, int sum ){
        int[][] dp = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            dp[i][i] = arr[i];
        }



        for (int i = 0; i < arr.length; i++) {
            if (dp[i][i] == sum) {
                System.out.println((i+1) + " " + (i+1));
                return;
            }
            for (int j = i + 1; j < arr.length; j++) {
                int tempSum = dp[i][j-1] + arr[j];
                if (tempSum == sum) {
                    System.out.println((i+1) + " " + (j+1));
                    return;
                } else if (tempSum > sum) {
                    break;
                }
                dp[i][j] = tempSum;
            }
        }

        System.out.println("-1");
    }

    // O(n)
    static void findSubarrayEfficient(int[] arr, int sum) {
        int curr_sum = 0;
        int startIndex = 0;

        for (int i = 0; i <= arr.length; i++) {
            if (curr_sum > sum) {
                while (curr_sum > sum && startIndex < i-1) {
                    curr_sum -= arr[startIndex];
                    startIndex++;
                }
            }

            if (curr_sum == sum) {
                System.out.println((startIndex+1)+" "+(i));
                return;
            }

            if (i < arr.length)
                curr_sum += arr[i];
        }

        System.out.println("-1");
    }

    public static void main(String[] args) {
        findSubarrayDP(new int[]{1, 2, 3, 7, 5}, 12);
        findSubarrayDP(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 15);

        findSubarrayEfficient(new int[]{1, 2, 3, 7, 5}, 12);
        findSubarrayEfficient(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 15);
    }
}
