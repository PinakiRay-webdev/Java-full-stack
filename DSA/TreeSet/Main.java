package DSA.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void Tree(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(50);
        treeSet.add(150);
        treeSet.add(25);
        treeSet.add(75);
        treeSet.add(125);
        treeSet.add(175);

        System.out.println(treeSet);
    }
    public static void main(String[] args) {
        Tree();
    }
}
