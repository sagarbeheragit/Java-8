package LinkedList;

/**
 * Write a method, linkedListFind, that takes in the head of a linked list and a target value.
 * The method should return a boolean indicating whether or not the linked list contains the target.
 *Node<String> a = new Node<>("a");
 * Node<String> b = new Node<>("b");
 * Node<String> c = new Node<>("c");
 * Node<String> d = new Node<>("d");
 *
 * a.next = b;
 * b.next = c;
 * c.next = d;
 *
 * // a -> b -> c -> d
 *
 * Source.linkedListFind(a, "c"); // true
 */
public class LinkedListFind {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;

        // a -> b -> c -> d
        System.out.println(linkedListFind(a,"c"));
    }

    private static boolean linkedListFind(Node<String> head, String target) {
        Node<String> current = head;
        while (current != null){
            if(current.val == target) return  true;
            current = current.next;
        }
        return false;
    }
}
