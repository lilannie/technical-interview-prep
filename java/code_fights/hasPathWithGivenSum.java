package code_fights;

import dataStructures.Tree;

public class hasPathWithGivenSum {
    //
    // Definition for binary tree:
    // class Tree<T> {
    //   Tree(T x) {
    //     value = x;
    //   }
    //   T value;
    //   Tree<T> left;
    //   Tree<T> right;
    // }
    boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
        if (t == null & s == 0) return true;

        return traverseTree(t, s, 0);
    }

    boolean traverseTree(Tree<Integer> t, int s, int prevSum) {
        if (t == null) return false;

        int currSum = prevSum + t.value;

        if (t.left == null && t.right == null) return s == currSum;

        if (traverseTree(t.left, s, currSum)) {
            return true;
        }

        return traverseTree(t.right, s, currSum);
    }
}
