package tree;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * Write a method, treeMinValue, that takes in the root of a binary tree that contains number values.
 * The method should return the minimum value within the tree.
 */
public class TreeMinValue {
    public static void main(String[] args) {
        Node<Double> a = new Node<>(3.);
        Node<Double> b = new Node<>(11.);
        Node<Double> c = new Node<>(4.);
        Node<Double> d = new Node<>(4.);
        Node<Double> e = new Node<>(0.1);
        Node<Double> f = new Node<>(1.);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        //       3
        //    /    \
        //   11     4
        //  / \      \
        // 4   -2     1

        System.out.println(treeMinValue(a)); // -> -2
        System.out.println(treeMinValueRecursive(a)); // -> -2
        System.out.println(treeMinValueBFS(a)); // -> -2
    }
    //DFS
    private static Double treeMinValue(Node<Double> root) {
        Stack<Node<Double>> stack = new Stack<>();
        if(root == null) return null;
        stack.push(root);
        Double min = Double.MAX_VALUE;
        while (!stack.isEmpty()){
            Node<Double> node = stack.pop();
            if(node.val < min){
                min = node.val;
            }
            if(node.left != null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
        }
        return min;
    }
    //Recursive
    private static Double treeMinValueRecursive(Node<Double> root) {
        if(root == null){
            return Double.POSITIVE_INFINITY;
        }
        double minvalue = Math.min(treeMinValueRecursive(root.left), treeMinValueRecursive(root.right));
        return Math.min(root.val, minvalue);
    }

    //BFS
    private static Double treeMinValueBFS(Node<Double> root) {
        if(root == null) return null;
        Queue<Node<Double>> queue = new ArrayDeque<>();
        queue.add(root);
        double min = Double.POSITIVE_INFINITY;
        while (!queue.isEmpty()){
            Node<Double> node = queue.poll();
            if(node.val < min){
                min = node.val;
            }
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return min;
    }

}
