package LinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a method, longestStreak, that takes in the head of a linked list as an argument.
 * The method should return the length of the longest consecutive streak of the same value within the list.
 * Node<Integer> a = new Node<>(5);
 * Node<Integer> b = new Node<>(5);
 * Node<Integer> c = new Node<>(7);
 * Node<Integer> d = new Node<>(7);
 * Node<Integer> e = new Node<>(7);
 * Node<Integer> f = new Node<>(6);
 *
 * a.next = b;
 * b.next = c;
 * c.next = d;
 * d.next = e;
 * e.next = f;
 *
 * // 5 -> 5 -> 7 -> 7 -> 7 -> 6
 *
 * Source.longestStreak(a); // 3
 */
public class LongestStreak {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(5);
        Node<Integer> b = new Node<>(5);
        Node<Integer> c = new Node<>(7);
        Node<Integer> d = new Node<>(7);
        Node<Integer> e = new Node<>(7);
        Node<Integer> f = new Node<>(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // 5 -> 5 -> 7 -> 7 -> 7 -> 6
        System.out.println(longestStreak(a));
    }

    private static int longestStreak(Node<Integer> head) {
        Node<Integer> current = head;
        int maxStreak = 0;
        int currentStreak = 0;
        Integer prevVal = 0;
        while(current != null){
            if(prevVal == current.val){
                currentStreak ++;
            }else {
                currentStreak = 1;
            }
            if(currentStreak > maxStreak){
                maxStreak = currentStreak;
            }
            prevVal = current.val;
            current = current.next;
        }
        return maxStreak;
    }
}
