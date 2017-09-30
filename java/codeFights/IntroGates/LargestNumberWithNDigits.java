package codeFights.IntroGates;

/*
Given an integer n, return the largest number that contains exactly n digits.
 */
public class LargestNumberWithNDigits {
    int largestNumber(int n) {
        String s = "";
        for(int i = 0; i < n; i++) {
            s += "9";
        }

        return Integer.parseInt(s);
    }
}
