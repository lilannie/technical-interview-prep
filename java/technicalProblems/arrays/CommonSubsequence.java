package technicalProblems.arrays;

import java.util.HashSet;

/*
Given two strings a and b print whether they contain any common subsequence (non empty) or not.
http://practice.geeksforgeeks.org/problems/common-subsequence/0
Input:
1
ABEF CADE
Output:
1

Explanation:
AE is a subsequence of both the string so the answer is 1
 */
public class CommonSubsequence {
    /*
        ABEF

        CADE
     */
    boolean hasCommonSubsequence(String a, String b) {
        HashSet<Character> aSet = new HashSet<>();
        HashSet<Character> bSet = new HashSet<>();

        int minLength;

        return true;
    }
}
