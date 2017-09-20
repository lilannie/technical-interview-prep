package leetCode;

public class longestPalandromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int n = s.length();
        int maxLen = Integer.MIN_VALUE;
        boolean[][] dp = new boolean[n][n];
        String longest = null;

        for (int len = 0; len < n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = i + len;
                if ((s.charAt(i) == s.charAt(j))
                        && (j-i<=2 || dp[i+1][j-1])) {

                    dp[i][j] = true;
                    int sub_len = j - i + 1;
                    if (sub_len > maxLen) {
                        maxLen = sub_len;
                        longest = s.substring(i, j+1);
                    }
                }

            }
        }

        return longest;
    }
}
