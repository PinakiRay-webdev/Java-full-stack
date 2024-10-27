//move all negative elements to one side of the array
package Problem;

public class Problem8 {
    static int[] makePartition(int[] arr){
        int []temp = new int[arr.length];

        int j=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] < 0){
                temp[j++] = arr[i];
            }
        }

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] >= 0){
                temp[j++] = arr[i];
            }
        }

        return temp;
    }

    static void display(int[] array){
        for(int i : array){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        int []array = {34 , 67 , -4 , 9 , -16 , 55 , -9 , -22};
        display(makePartition(array));

    }
}
