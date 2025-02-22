package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Write a method, depthFirstValues, that takes in the root of a binary tree. The method should return a List containing
 * all values of the tree in depth-first order.
 */
public class DepthFirstValues {
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

        System.out.println(depthFirstValues(a));
        //    -> ["a", "b", "d", "e", "c", "f"]

    }

    private static List<String>  depthFirstValues(Node<String> root) {
        List<String> values = new ArrayList<>();
        Stack<Node<String>> stack = new Stack<>();
        if(root != null){
            stack.push(root);
        }
        while (!stack.isEmpty()){
            Node<String> node = stack.pop();
            values.add(node.val);
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
        return values;
    }
    // Recursive way.
    private static List<String>  depthFirstValuesRecursive(Node<String> root) {
        if(root == null){
            return List.of();
        }
        List<String> values = new ArrayList<>();
        values.add(root.val);
        values.addAll(depthFirstValuesRecursive(root.left));
        values.addAll(depthFirstValuesRecursive(root.right));
        return values;
    }

}

class Node<T>{
    T val;
    Node<T> left;
    Node<T> right;
    Node(T val){
        this.val=val;
        left=null;
        right=null;
    }

}
