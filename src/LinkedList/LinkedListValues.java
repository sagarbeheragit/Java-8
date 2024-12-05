package LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method, linkedListValues, that takes in the head of a linked list as an argument.
 * The method should return a List containing all values of the nodes in the linked list.
 *
 * Node<String> a = new Node<>("a");
 * Node<String> b = new Node<>("b");
 * Node<String> c = new Node<>("c");
 * Node<String> d = new Node<>("d");
 * a.next = b;
 * b.next = c;
 * c.next = d;
 * // a -> b -> c -> d
 * linkedListValues(a);
 * // -> [ "a", "b", "c", "d" ]
 */
public class LinkedListValues {

    public static void main(String[] args) {

        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(linkedListValues(a));
    }

    private static List<String> linkedListValues(Node<String> head) {
        Node<String> current = head;
        List<String> result = new ArrayList<>();
        while (current != null){
            result.add(current.val);
            current = current.next;
        }
        return result;
    }

}

class Node<T>{
    T val;
    Node<T> next;
    Node(T val){
        this.val = val;
        this.next = null;
    }
}
