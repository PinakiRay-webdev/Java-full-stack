package Problem;

import java.util.*;

public class Problem12 {
    static Set<Integer> findDuplicates(int []array){
        Arrays.sort(array);
        Set<Integer> myList = new HashSet<>();
        for(int i=0 ; i<array.length-1 ; i++){
            if(array[i] == array[i+1]){
                myList.add(array[i]);
            }
        }

        return myList;
    }
    public static void main(String[] args){
        int []array = {2, 3, 1, 2, 3, 3};
        System.out.println(findDuplicates(array));
    }
}
