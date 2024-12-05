package LinkedList;

import java.util.List;

/**
 * Write a method, reverseList, that takes in the head of a linked list as an argument.
 * The method should reverse the order of the nodes in the linked list in-place and return the new head of the reversed linked list.
 * Node<String> a = new Node<>("a");
 * Node<String> b = new Node<>("b");
 * Node<String> c = new Node<>("c");
 * Node<String> d = new Node<>("d");
 * Node<String> e = new Node<>("e");
 * Node<String> f = new Node<>("f");
 *
 * a.next = b;
 * b.next = c;
 * c.next = d;
 * d.next = e;
 * e.next = f;
 *
 * // a -> b -> c -> d -> e -> f
 *
 * reverseList(a); // f -> e -> d -> c -> b -> a
 */
public class ReverseList {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(reverseList(a).val);
    }

    private static  Node<String> reverseList(Node<String> head) {
        Node<String> current = head;
        Node<String> previous = null;
        while (current != null){
            Node<String> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
