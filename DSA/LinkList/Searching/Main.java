package DSA.LinkList.Searching;

public class Main {
    public static void main(String[] args) {
        LinkedListDemo ll = new LinkedListDemo();
        ll.createNode();
        ll.display();
        int temp = ll.searchElement1(9);
        System.out.println( (temp == -1) ? "Element not found" : "Element is present at "+temp );
    }
}
