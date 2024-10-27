package DSA.Queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Sample {
    public static void ArrayDeque(){
        Deque<Integer> deque = new ArrayDeque<>(5);

        deque.addFirst(10);
        deque.addLast(30);
        deque.addLast(50);

        System.out.println(deque);
        deque.offer(100);
        System.out.println(deque);

        deque.offerFirst(200);
        deque.offerLast(300);
        System.out.println(deque);

        deque.addLast(30);
        deque.addLast(50);
        System.out.println(deque);

        deque.removeFirstOccurrence(30);
        System.out.println(deque);

        deque.removeLastOccurrence(50);
        System.out.println(deque);
    }
    public static void main(String[] args) {
        ArrayDeque();
    }
}
