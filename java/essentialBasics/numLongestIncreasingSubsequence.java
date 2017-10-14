package essentialBasics;

public class numLongestIncreasingSubsequence {

    static int findLongestIncreasingSubseuqnce(int[] arr) {
        int[] dp = new int[arr.length];

        int max = Integer.MIN_VALUE;
        int count_max = 0;

        if (arr.length <= 1) return arr.length;
        dp[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int curr_max = Integer.MIN_VALUE;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < curr) {                // increasing order
                    int curr_dp = dp[j] + 1;

                    if (curr_dp > curr_max) {
                        curr_max = curr_dp;
                    }

                    if (curr_dp > max) {
                        max = curr_dp;
                        count_max = 1;
                    } else if (curr_dp == max) {
                        count_max++;
                    }
                }
            }

            dp[i] = curr_max;
        }

        //  arr     1 2 4 5
        //  dp      1 2
        //  max     2
        //  count   1

        System.out.println("max length: "+max);
        return count_max;
    }

    public static void main(String[] args) {
        System.out.println(findLongestIncreasingSubseuqnce(new int[]{1, 4, 2, 5}));
    }
}
