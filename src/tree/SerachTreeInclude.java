package tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Write a method, treeIncludes, that takes in the root of a binary tree and a target value.
 * The method should return a boolean indicating whether or not the value is contained in the tree.
 */
public class SerachTreeInclude {
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

        System.out.println(treeIncludes(a, "e")); // -> true
        System.out.println(treeIncludesRecursive(a, "e")); // -> true
        System.out.println(treeIncludesBFS(a, "g"));

    }
    //DFS
    private static boolean treeIncludes(Node<String> root, String target) {
        if(root == null) return false;
        Stack<Node<String>> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node<String> node = stack.pop();
            if(node.val == target){
                return true;
            }
            if(node.left != null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
        }
        return false;
    }
    private static boolean treeIncludesRecursive(Node<String> root, String target) {
        if(root == null){
            return false;
        }
        if(root.val == target){
            return true;
        }
        return treeIncludesRecursive(root.right, target) || treeIncludesRecursive(root.left, target);
    }

    //BFS
    private static boolean treeIncludesBFS(Node<String> root, String target) {
        if(root == null) return false;
        Queue<Node<String>> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node<String> node = queue.poll();
            if(node.val == target) return true;
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        return false;
    }
}
