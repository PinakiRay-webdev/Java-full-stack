//find first and last occurrence of an element of an array

package Problem;

import java.util.Arrays;

public class Problem6 {
    static String getRange(int []array , int target){
        int start = -1;
        int end = -1;

        int []temp = new int[2];

        for(int i=0 ; i<array.length ; i++){
            if(array[i] == target){
                start = i;
                break;
            }
        }

        for(int i=array.length-1 ; i>0 ; i--){
            if(array[i] == target){
                end = i;
                break;
            }
        }

        temp[0] = start;
        temp[1] = end;

        return Arrays.toString(temp);

    }

    public static void main(String[] args){
        int []array = {5, 7, 7, 8, 8, 10};
        int target = 6;

        System.out.println(getRange(array , target));

    }
}
