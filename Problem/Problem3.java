package Problem;

import java.util.ArrayList;

class Sort{
    public ArrayList<Integer> getSort(int []array){

        ArrayList<Integer> myList = new ArrayList<>();

        for(int i=0 ; i<array.length ; i++){
            if(array[i] == 0){
                myList.add(0);
            }
        }

        for(int i=0 ; i<array.length ; i++){
            if(array[i] == 1){
                myList.add(1);
            }
        }

        for(int i=0 ; i<array.length ; i++){
            if(array[i] == 2){
                myList.add(2);
            }
        }

        return myList;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int []array = {0, 2, 1, 2, 0};
        System.out.println(sort.getSort(array));
    }
}
