//sort the 0s , 1s and 2s of an array
package Problem;

public class Problem5 {
    static int[] sortArray(int []array){
        int []temp = new int[array.length];

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i : array){
            if(i == 0){
                count0++;
            } else if(i == 1){
                count1++;
            } else {
                count2++;
            }
        }
        int j = 0;
        for(int i=0 ; i<count0 ; i++){
            temp[j++] = 0;
        }

        for(int i=0 ; i<count1 ; i++){
            temp[j++] = 1;
        }

        for(int i=0 ; i<count2 ; i++){
            temp[j++] = 2;
        }

        return temp;
    }

    static void display(int []array){
        for(int i : array){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        int []array = {0, 1, 2, 0, 1, 2};
        display(sortArray(array));
    }
}
