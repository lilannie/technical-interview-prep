package technicalProblems.recursion;

public class MatrixChainOrder {
    public static int findMinOrder(int[] arr, int i, int j) {
        if (i == j)
            return 0;

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int val = findMinOrder(arr, i, k) +
                    findMinOrder(arr, k+1, j) +
                    arr[i-1] * arr[k] * arr[j];

            if (val < min) {
                min = val;
            }
        }

        return min;
    }

    public static int findMinOrderDP(int[] arr, int n) {
        int[][] dp = new int[n][n];

        for (int i = 1; i < n; i++) {
            dp[i][i] = 0;
        }

        for (int len = 2; len < n; len++) {
            for (int i = 1; i < n - len + 1; i++) {
                int j = i + len - 1;

                if (j == n) continue;

                for (int k = i; k <= j - 1; k++) {
                    int val = dp[i][k] + dp[k+1][j] + arr[i-1]*arr[k]*arr[j];
                    if (val < dp[i][j])
                        dp[i][j] = val;
                }
            }
        }

        return dp[1][n-1];
    }

    public static void main(String[] args){
        int arr[] = new int[] {1, 2, 3, 4, 3};
        int n = arr.length;

        System.out.println("Minimum number of multiplications is "+
                findMinOrder(arr, 1, n-1));
    }
}
