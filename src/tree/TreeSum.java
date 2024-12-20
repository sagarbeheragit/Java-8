package tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Write a method, treeSum, that takes in the root of a binary tree that contains number values.
 * The method should return the total sum of all values in the tree.
 */
public class TreeSum {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(3);
        Node<Integer> b = new Node<>(11);
        Node<Integer> c = new Node<>(4);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(-2);
        Node<Integer> f = new Node<>(1);

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

        System.out.println(treeSum(a)); // -> 21
        System.out.println(treeSumRecursive(a)); // -> 21
        System.out.println(treeSumBFS(a));
    }
    //Depth First
    private static int treeSum(Node<Integer> root) {
        int sum = 0;
        Stack<Node<Integer>> stack = new Stack<>();
        if(root != null){
            stack.push(root);
        }
        while (!stack.isEmpty()){
            Node<Integer> node = stack.pop();
            sum += node.val;
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
        return sum;
    }
    //Recursive
    private static int treeSumRecursive(Node<Integer> root) {
        if(root == null){
            return 0;
        }
        int sum = 0;
        sum += root.val;
        sum += treeSumRecursive(root.left);
        sum += treeSumRecursive(root.right);
        return  sum;
    }

    //Breadth First
    private static int treeSumBFS(Node<Integer> root) {
        int sum = 0;
        Queue<Node<Integer>> queue = new ArrayDeque<>();
        if(root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            Node<Integer> node = queue.poll();
            sum += node.val;
            if(node.right != null){
                queue.add(node.right);
            }
            if(node.left != null){
                queue.add(node.left);
            }
        }
        return sum;
    }
}
