//rotate array by one

package Problem;

public class Problem10 {
    static int [] rotatedArrayByOne(int []array){

        int temp = array[array.length-1];
        for(int i=array.length-2 ; i> -1 ; i--){
            array[i+1] = array[i];
        }

        array[0] = temp;

        return array;
    }

    static void display(int []array){
        for(int i : array){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        int [] array = {9, 8, 7, 6, 4, 2, 1, 3};
        display(rotatedArrayByOne(array));
    }
}
