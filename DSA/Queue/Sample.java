package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Sample {
    public static void enQueue(){
        Queue <Integer> queue = new LinkedList<>(); //created queue using linked list
        queue.add(10);  //adding element to the queue
        queue.add(20);
        queue.add(30);
        System.out.println(queue);

        queue.poll(); //removing the element which was inserted first, i.e 10

        System.out.println("It is the updated queue👇👇");
        System.out.println(queue);

        System.out.println(queue.peek()); //peeking / displaying the first element of the queue

        System.out.println(queue.isEmpty()); //to check if the queue is empty or not
    }

    public static void main(String[] args) {
    enQueue();
    }
}
