package CollectionFramework.LinkList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10); //to add element
        linkedList.addLast(20); //to add element at last
        linkedList.addFirst(30); //to add element at first
        System.out.println(linkedList);

        linkedList.add(1 , 45); //to add element at a particular index
        System.out.println(linkedList);

        linkedList.removeLast(); //to remove the last element
        System.out.println(linkedList);
        linkedList.removeFirst(); //to remove the first element
        System.out.println(linkedList);

        System.out.println(linkedList.reversed()); //to reverse the linked list
    }
}
