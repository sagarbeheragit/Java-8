package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Write a method, breadthFirstValues, that takes in the root of a binary tree.
 * The method should return an array containing all values of the tree in breadth-first order.
 */
public class BreadthFirstValues {
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

        System.out.println(breadthFirstValues(a));
        //    -> ["a", "b", "c", "d", "e", "f"]

    }

    private static List<String> breadthFirstValues(Node<String> root) {
        List<String> values = new ArrayList<>();
        Queue<Node<String>> queue = new ArrayDeque<>();
        if(root != null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            Node<String> node = queue.poll();
            values.add(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return values;
    }
}
