package LinkedList;

/**
 * Write a method, sumList, that takes in the head of a linked list containing integers as an argument.
 * The method should return the total sum of all values in the linked list.
 * Node<Integer> a = new Node<>(2);
 * Node<Integer> b = new Node<>(8);
 * Node<Integer> c = new Node<>(3);
 * Node<Integer> d = new Node<>(-1);
 * Node<Integer> e = new Node<>(7);
 * Source.sumList(a); // 19
 */
public class SumList {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(2);
        Node<Integer> b = new Node<>(8);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(-1);
        Node<Integer> e = new Node<>(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(sumList(a));
    }

    private static int sumList(Node<Integer> head) {
        int total = 0;
        Node<Integer> current = head;
        while (current != null){
            total += current.val;
            current = current.next;
        }
        return total;
    }
}
