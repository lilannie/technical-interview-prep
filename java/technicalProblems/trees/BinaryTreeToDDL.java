package technicalProblems.trees;

import dataStructures.BinaryTreeNode;

public class BinaryTreeToDDL {

    public static BinaryTreeNode convertToDLL(BinaryTreeNode node) {
        if (node == null)
            return node;

        if (node.left != null) {
            BinaryTreeNode left = convertToDLL(node.left);

            for (; left.right != null; left = left.right) ;

            left.next = node;
            node.prev = left;
        }

        if (node.right != null) {
            BinaryTreeNode right = convertToDLL(node.right);

            for (; right.left != null; right = right.left);

            right.prev = node;
            node.next = right;
        }

        return node;
    }
}
