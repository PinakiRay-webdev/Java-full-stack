package DSA.LinkList;

public class MyLinkList<T> {
    class Node{
        T data;
        Node next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void createNode(T data){
        if(head == null){
            Node node = new Node(data);
            head = tail = node;
        } else {
            System.out.println("Node is already created");
        }
    }

    public void addLast(T data){
        if(head == null){
            System.out.println("Create a node first");
            return;
        }

        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
    }

    public void addFirst(T data){
        if(head == null){
            System.out.println("Create a node first");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Link list is empty");
            return;
        }

        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("Link list is empty");
            return;
        }

        if(head == tail){
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("Link list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

}
