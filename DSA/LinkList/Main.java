package DSA.LinkList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MyLinkList<Integer> linkList = new MyLinkList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice!=7)
        {
            System.out.println("1-> Create a node");
            System.out.println("2-> Add an element at the last");
            System.out.println("3-> Add an element at the first");
            System.out.println("4-> Delete an element from the last");
            System.out.println("5-> Delete an element from the first");
            System.out.println("6-> Display the link list");
            System.out.println("8-> Add in the middle");
            System.out.println("7-> Exit");
            System.out.println("\nEnter the choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                {
                    System.out.println("Enter the data you want to insert");
                    int data = sc.nextInt();
                    linkList.createNode(data);
                    break;
                }
                case 2:{
                    System.out.println("Enter the data you want to insert");
                    int data = sc.nextInt();
                    linkList.addLast(data);
                    break;
                }
                case 3:{
                    System.out.println("Enter the data you want to insert");
                    int data = sc.nextInt();
                    linkList.addFirst(data);
                    break;
                }
                case 4: {

                    linkList.deleteLast();
                    break;
                }
                case 5:
                {
                    linkList.deleteFirst();
                    break;
                }
                case 6:{
                    linkList.display();
                    break;
                }
                case 7:
                {
                    break;
                }
                case 8:
                {
                    System.out.println("Enter the data you want to insert");
                    int data = sc.nextInt();
                    System.out.println("Enter the index");
                    int index = sc.nextInt();
                    linkList.addMiddle(index , data);
                    break;
                }
            }
        }
    }
}
