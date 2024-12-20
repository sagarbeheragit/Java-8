package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a method, allTreePaths, that takes in the root of a binary tree. The method should return a 2-Dimensional list where each sublist
 * represents a root-to-leaf path in the tree.
 * The order within an individual path must start at the root and end at the leaf, but the relative order among paths in the outer list does not matter.
 *
 * You may assume that the input tree is non-empty.
 */
public class AllTreePaths {
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


        List<List<String>> paths = allTreePaths(a) ;// ->
        for (List<String> path : paths) {
            Collections.reverse(path);
        }
        System.out.println(paths);
        // [ 
        //   [ 'a', 'b', 'd' ], 
        //   [ 'a', 'b', 'e' ], 
        //   [ 'a', 'c', 'f' ] 
        // ] 
    }

    private static List<List<String>> allTreePaths(Node<String> root) {
        if(root == null) return List.of();
        if(root.left == null && root.right == null){
            List<String> path = new ArrayList<>();
            path.add(root.val);
            return List.of(path);
        }
        List<List<String>> allpaths = new ArrayList<>();
        for(List path: allTreePaths(root.left)){
            path.add(root.val);
            allpaths.add(path);
        }
        for(List path: allTreePaths(root.right)){
            path.add(root.val);
            allpaths.add(path);
        }
        return  allpaths;
    }
}
