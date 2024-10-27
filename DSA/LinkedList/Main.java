package DSA.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyLinkList<Integer> ll = new MyLinkList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5){
            System.out.println("1-> Create a node");
            System.out.println("2-> Add element at first");
            System.out.println("3-> Add element at last");
            System.out.println("4-> Display LinkList");
            System.out.println("5-> Exit");
            System.out.println("6-> Delete first element");
            System.out.println("Enter the choice");
            choice = scanner.nextInt();

            switch (choice){
                case 1 ->
                {
                    System.out.println("Enter the Data");
                    int data = scanner.nextInt();
                    ll.createNode(data);
                }
                case 2 ->
                {
                    if(ll.size == 0){
                        System.out.println("======Create a node first======");
                    } else {
                        System.out.println("Enter the Data");
                        int data = scanner.nextInt();
                        ll.addFirst(data);
                    }
                }
                case 3 ->
                    {
                        if(ll.size == 0){
                            System.out.println("======Create a node first======");
                        } else {
                            System.out.println("Enter the Data");
                            int data = scanner.nextInt();
                            ll.addLast(data);
                        }
                    }
                case 4 -> ll.display();
                case 5 -> {
                    break;
                }
                case 6 -> ll.deleteFirst();
            }
        }
    }
}
