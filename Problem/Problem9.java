//Given two arrays a[] and b[], the task is to find the number of elements in the union between these two arrays.
///The Union of the two arrays can be defined as the set containing distinct elements from both arrays.
// If there are repetitions, then only one element occurrence should be there in the union.

package Problem;

import java.util.HashSet;
import java.util.Set;

public class Problem9 {
    static int getUnion(int[] a , int [] b){
        Set<Integer> myset = new HashSet<>();

        for(int i : a){
            myset.add(i);
        }

        for(int i : b){
            myset.add(i);
        }

        return myset.size();
    }
    public static void main(String[] args){
        int []a = {85, 25, 1, 32, 54, 6};
        int []b = {85, 2};

        System.out.println(getUnion(a , b));
    }
}
