package tree;

import java.util.Stack;

/**
 * Write a method, howHigh, that takes in the root of a binary tree. The method should return a number representing the height of the tree.
 *
 * The height of a binary tree is defined as the maximal number of edges from the root node to any leaf node.
 *
 * If the tree is empty, return -1.
 */
public class HeightOfTree {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        //      a
        //    /   \
        //   b     c
        //  / \     \
        // d   e     f

        System.out.println(howHigh(a)); // -> 2

    }
    //DFS recursive
    private static int howHigh(Node<String> root) {
        if(root == null) return -1;
        return 1 + Math.max(howHigh(root.left), howHigh(root.right));
    }
}
