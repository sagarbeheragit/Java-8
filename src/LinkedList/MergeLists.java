package LinkedList;

/**
 * Write a method, mergeLists, that takes in the head of two sorted linked lists as arguments.
 * The method should merge the two lists together into single sorted linked list. The method should return the head of the merged linked list.
 * Node<Integer> a = new Node<>(5);
 * Node<Integer> b = new Node<>(7);
 * Node<Integer> c = new Node<>(10);
 * Node<Integer> d = new Node<>(12);
 * Node<Integer> e = new Node<>(20);
 * Node<Integer> f = new Node<>(28);
 * a.next = b;
 * b.next = c;
 * c.next = d;
 * d.next = e;
 * e.next = f;
 * // 5 -> 7 -> 10 -> 12 -> 20 -> 28
 *
 * Node<Integer> q = new Node<>(6);
 * Node<Integer> r = new Node<>(8);
 * Node<Integer> s = new Node<>(9);
 * Node<Integer> t = new Node<>(25);
 * q.next = r;
 * r.next = s;
 * s.next = t;
 * // 6 -> 8 -> 9 -> 25
 *
 * Source.mergeLists(a, q);
 * // 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 12 -> 20 -> 25 -> 28
 */
public class MergeLists {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(5);
        Node<Integer> b = new Node<>(7);
        Node<Integer> c = new Node<>(10);
        Node<Integer> d = new Node<>(12);
        Node<Integer> e = new Node<>(20);
        Node<Integer> f = new Node<>(28);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 5 -> 7 -> 10 -> 12 -> 20 -> 28

        Node<Integer> q = new Node<>(6);
        Node<Integer> r = new Node<>(8);
        Node<Integer> s = new Node<>(9);
        Node<Integer> t = new Node<>(25);
        q.next = r;
        r.next = s;
        s.next = t;
        // 6 -> 8 -> 9 -> 25

        Node<Integer> node = mergeLists(a, q);
        // 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 12 -> 20 -> 25 -> 28
        while (node != null){
            System.out.print(" "+ node.val);
            node = node.next;
        }

    }

    private static  Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2){
        Node<Integer> dummyHead = new Node<>(0);
        Node<Integer> head = dummyHead;
        Node<Integer> current1 = head1;
        Node<Integer> current2 = head2;
        while (current1 != null && current2 != null){
            if(current1.val < current2.val){
                head.next = current1;
                current1 = current1.next;
            }else{
                head.next = current2;
                current2 = current2.next;
            }
            head = head.next;
        }
        if(current1 != null){
            head.next = current1;
        }
        if(current2 != null){
            head.next = current2;
        }
        return dummyHead.next;
    }
}
