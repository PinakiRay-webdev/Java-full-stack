package DSA.Sorting;
public class BubbleSort {
    public static void sortedArray(int []arr){
        for(int i=0 ; i<arr.length-1 ; i++) {
            for(int j=0 ; j<arr.length-i-1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void display(int [] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        int []arr = {8 , 6 , 9 , 2 ,4 , 5};

        sortedArray(arr);
        display(arr);
    }
}
