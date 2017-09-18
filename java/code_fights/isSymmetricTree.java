package code_fights;

import dataStructures.Tree;

public class isSymmetricTree {
// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
    boolean isTreeSymmetric(Tree<Integer> t) {
        if (t == null) return true;

        return isSymmetric(t.left, t.right);
    }

    boolean isSymmetric(Tree<Integer> left_sub, Tree<Integer> right_sub) {
        if (left_sub == null && right_sub == null) return true;
        if (left_sub == null && right_sub != null) return false;
        if (left_sub != null && right_sub == null) return false;

        if (left_sub.left != null && !isSymmetric(left_sub.left, right_sub.right))
            return false;

        if (left_sub.right != null && !isSymmetric(left_sub.right, right_sub.left))
            return false;

        return left_sub.value == right_sub.value;
    }


}
