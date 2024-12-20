package tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Write a method, treeValueCount, that takes in the root of a binary tree and a target value.
 * The method should return the number of times that the target occurs in the tree.
 */
public class TreeValueCount {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(12);
        Node<Integer> b = new Node<>(6);
        Node<Integer> c = new Node<>(6);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(6);
        Node<Integer> f = new Node<>(12);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        //      12
        //    /   \
        //   6     6
        //  / \     \
        // 4   6     12

        System.out.println(treeValueCount(a,  6)); // -> 3
        System.out.println(treeValueCountBFS(a,  6)); // -> 3
        System.out.println(treeValueCountRecursive(a,  6)); // -> 3
    }

    //DFS
    private static int treeValueCount(Node<Integer> root, int target) {
        if(root == null) return 0;
        Stack<Node<Integer>> stack = new Stack<>();
        stack.push(root);
        int count = 0;
        while (!stack.isEmpty()){
            Node<Integer> node = stack.pop();
            if(node.val == target){
                count++;
            }
            if(node.left != null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
        }
        return count;
    }
    //DFS Recursive
    private static int treeValueCountRecursive(Node<Integer> root, int target) {
        if(root == null) return  0;
        int match = root.val == target? 1:0;
        return match + treeValueCountRecursive(root.left, target) + treeValueCountRecursive(root.right, target);
    }
    //BFS
    private static int treeValueCountBFS(Node<Integer> root, int target) {
        if(root == null)return  0;
        Queue<Node<Integer>> queue = new ArrayDeque<>();
        int count = 0;
        queue.add(root);
        while (!queue.isEmpty()){
            Node<Integer> node = queue.poll();
            if(node.val == target){
                count++;
            }
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return count;
    }
}
