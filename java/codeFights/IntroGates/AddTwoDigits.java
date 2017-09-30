package codeFights.IntroGates;

/*
You are given a two-digit integer n. Return the sum of its digits.
 */
public class AddTwoDigits {
    int addTwoDigits(int n) {
        int tens = n/ 10;
        int ones = n - (tens*10);
        return tens + ones;
    }
}
