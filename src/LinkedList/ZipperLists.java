package LinkedList;

/**
 * Write a method, zipperLists, that takes in the head of two linked lists as arguments. The method should zipper the two lists together into single
 * linked list by alternating nodes. If one of the linked lists is longer than the other, the resulting list should terminate with the remaining nodes. The method should return the head of the zippered linked list.
 * Do this in-place, by mutating the original Nodes.
 * Node<String> a = new Node<>("a");
 * Node<String> b = new Node<>("b");
 * Node<String> c = new Node<>("c");
 * a.next = b;
 * b.next = c;
 * // a -> b -> c
 *
 * Node<String> x = new Node<>("x");
 * Node<String> y = new Node<>("y");
 * Node<String> z = new Node<>("z");
 * x.next = y;
 * y.next = z;
 * // x -> y -> z
 *
 * Source.zipperLists(a, x);
 * // a -> x -> b -> y -> c -> z
 */
public class ZipperLists {
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        a.next = b;
        b.next = c;
        // a -> b -> c

        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
        Node<String> z = new Node<>("z");
        x.next = y;
        y.next = z;
        // x -> y -> z
        Node<String> node = zipperLists(a, x);
        while (node != null){
            System.out.print(node.val);
            node = node.next;
        }
        
    }

    private static Node<String> zipperLists(Node<String> head1, Node<String> head2) {
        Node<String> head = head1;
        Node<String> tail = head;
        Node<String> current1 = head1.next;
        Node<String> current2 = head2;
        int count = 0;
        while (current1 != null &&  current2 != null){
            if(count % 2 == 0){
                tail.next = current2;
                current2 = current2.next;
            }else{
                tail.next = current1;
                current1 = current1.next;
            }
            tail = tail.next;
            count += 1;
        }
        if(current1 != null){
            tail.next = current1;
        }
        if(current2 != null){
            tail.next = current2;
        }
        return head;
    }

}
