package technicalProblems.lists;

import dataStructures.Tree;

import java.util.LinkedList;

public class PrintRootToLeaf {

    /*
        A B C
        A D E G
        A D F H
               A
          B			D
        C		  E   F
                G		H
    */
    static void printRootToLeaf(Tree<Character> root, LinkedList<Character> list) {
        if (root == null) {
            System.out.println("");
            return;
        }

        if (root.left == null && root.right == null) {
            for(Character c: list)
                System.out.print(c);

            System.out.println(root.value);
            return;
        }

        list.add(root.value);

        if (root.left != null) {
            printRootToLeaf(root.left, list);
        }

        if (root.right != null) {
            printRootToLeaf(root.right, list);
        }

        list.removeLast();
    }

    public static void main(String[] args) {
        Tree<Character> node1 = new Tree<>('A');
        Tree<Character> node2 = new Tree<>('B');
        Tree<Character> node3 = new Tree<>('C');
        Tree<Character> node4 = new Tree<>('D');
        Tree<Character> node5 = new Tree<>('E');
        Tree<Character> node6 = new Tree<>('F');
        Tree<Character> node7 = new Tree<>('G');
        Tree<Character> node8 = new Tree<>('H');

        node1.left = node2;
        node2.left = node3;

        node1.right = node4;
        node4.left = node5;
        node5.left = node7;
        node4.right = node6;
        node6.right = node8;

        printRootToLeaf(node1, new LinkedList<Character>());
    }
}
