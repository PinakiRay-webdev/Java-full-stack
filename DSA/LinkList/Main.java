package DSA.LinkList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MyLinkList<String> linkList = new MyLinkList<>();
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
            System.out.println("7-> Exit");
            System.out.println("\nEnter the choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                {
                    linkList.createNode("Rohan");
                    break;
                }
                case 2:{
                    linkList.addLast("Bikash");
                    break;
                }
                case 3:{
                    linkList.addFirst("Rahul");
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
            }
        }
    }
}
