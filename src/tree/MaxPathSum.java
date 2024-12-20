package tree;

/**
 * Write a method, maxPathSum, that takes in the root of a binary tree that contains number values.
 * The method should return the maximum sum of any root to leaf path within the tree.Node<Double> a = new Node<>(3.);
 * Node<Double> b = new Node<>(11.);
 * Node<Double> c = new Node<>(4.);
 * Node<Double> d = new Node<>(4.);
 * Node<Double> e = new Node<>(-2.);
 * Node<Double> f = new Node<>(1.);
 *
 * a.left = b;
 * a.right = c;
 * b.left = d;
 * b.right = e;
 * c.right = f;
 *
 * //       3
 * //    /    \
 * //   11     4
 * //  / \      \
 * // 4   -2     1
 *
 * Source.maxPathSum(a); // -> 18
 * 
 */
public class MaxPathSum {
    public static void main(String[] args) {
        Node<Double> a = new Node<>(3.);
        Node<Double> b = new Node<>(11.);
        Node<Double> c = new Node<>(4.);
        Node<Double> d = new Node<>(4.);
        Node<Double> e = new Node<>(-2.);
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

        System.out.println(maxPathSum(a)); // -> 18

    }

    private static Double maxPathSum(Node<Double> root) {
        if(root == null){
            return Double.NEGATIVE_INFINITY;
        }
        if(root.left == null & root.right == null){
            return root.val;
        }
        return root.val + Math.max(maxPathSum(root.left),maxPathSum(root.right));
    }
}
