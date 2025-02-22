package LinkedList;

/**
 * Write a method, getNodeValue, that takes in the head of a linked list and an index. The method should return the value of the linked list at the specified index.
 * If there is no node at the given index, then return null.
 * Node<String> a = new Node<>("a");
 * Node<String> b = new Node<>("b");
 * Node<String> c = new Node<>("c");
 * Node<String> d = new Node<>("d");
 *
 * a.next = b;
 * b.next = c;
 * c.next = d;
 *
 * // a -> b -> c -> d
 *getNodeValue(a, 2); // "c"
 */
public class GetNodeValue {

    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(getNodeValue(a, 2));
    }

    private static String getNodeValue(Node<String> head, int index) {
       String result = "";
       Node<String> current = head;
       int i = 0;
       while (current != null){
           if(index == i){
               result = current.val;
           }
           current = current.next;
           i += 1;
       }
       return result;
    }
}
