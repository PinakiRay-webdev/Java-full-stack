package DSA.Hash.HashSetDemo;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<Integer> hash = new HashSet<>();
        hash.add(100);
        hash.add(25);
        hash.add(150);
        System.out.println(hash);
    }
}
