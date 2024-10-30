package DSA.LinkList.Searching;

public class LinkedListDemo {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void createNode(){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = tail;
    }

    public int searchElement1(int data){    //By iterative method
        Node currentNode = head;
        int index = 0;
        while (currentNode != null){
            if(currentNode.data == data){
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }

        return -1;
    }

    public void display(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }
}
