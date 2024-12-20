package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Write a method, pathFinder, that takes in the root of a binary tree and a target value. The method should return an array representing a path to the target value.
 * If the target value is not found in the tree, then return null.
 */
public class PathFinder {

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

        System.out.println(pathFinder(a, "e")); // -> [ "a", "b", "e" ]
    }

    private static List<String> pathFinder(Node<String> root, String target) {
        if(root == null) return  null;
        if(root.val == target){
            return List.of(root.val);
        }
        List<String> leftPaths = pathFinder(root.left, target);
        if(leftPaths != null){
            List<String> newList = new ArrayList<>();
            newList.add(root.val);
            newList.addAll(leftPaths);
            return newList;
        }
        List<String> rightPaths = pathFinder(root.right, target);
        if(rightPaths != null){
            List<String> newList = new ArrayList<>();
            newList.add(root.val);
            newList.addAll(rightPaths);
            return newList;
        }
        return null;
    }
}
