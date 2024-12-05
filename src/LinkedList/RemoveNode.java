package LinkedList;

/**
 * Write a method, removeNode, that takes in the head of a linked list and a target value as arguments.
 * The method should delete the node containing the target value from the linked list and return the head of the resulting linked list.
 * If the target appears multiple times in the linked list, only remove the first instance of the target in the list.
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
 * Source.removeNode(a, "c");
 * // a -> b -> d -> e -> f
 */
public class RemoveNode {
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

        // a -> b -> c -> d -> e -> f
        removeNode(a, "c");
    }

    private static Node<String> removeNode(Node<String> head, String targetVal) {
        if(head.val == targetVal){
            return head.next;
        }
        Node<String> current = head;
        Node<String> prev = null;
        while(current != null){
            if(current.val == targetVal){
                prev.next = current.next;
                break;
            }
            prev = current;
            current = current.next;
        }
        return head;
    }
}
