package DSA.LinkedList;

public class MyLinkList<T> {
    private Node head;
    int size = 0;
    class Node {
        T data;
        Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public void createNode(T data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            size++;
            return;
        }else{
            System.out.println("Node is already created");
        }
    }

    public void addFirst(T data){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("Create a node first");
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(T data){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("Create a node first");
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        size++;
    }

    public void deleteFirst(){
        if (head == null){
            System.out.println("======Array is empty======");
            return;
        }

        head = head.next;
    }

    public void display(){
        Node currentNode = head;
        System.out.println("=============");
        if(head == null){
            System.out.println("Link list is empty");
            return;
        }
        while(currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
        System.out.println("===============");
    }
}
