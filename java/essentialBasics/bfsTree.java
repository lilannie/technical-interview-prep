package essentialBasics;

import dataStructures.Tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class bfsTree {

// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
    int[] traverseTree(Tree<Integer> t) {
        if (t == null) return new int[0];

        ArrayList<Integer> elements = new ArrayList<>();
        LinkedList<Tree<Integer>> queue = new LinkedList<>();
        Tree<Integer> curr = null;
        queue.add(t);

        while (!queue.isEmpty()) {
            curr = queue.removeFirst();
            elements.add(curr.value);
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }

        int[] ret = new int[elements.size()];
        int i = 0;
        for (int element: elements) {
            ret[i] = element;
            i++;
        }

        return ret;
    }

}
