package DSA.Sorting;

public class SelectionSort {
    static void sortedArray(int []arr){
        for(int i=0 ; i<arr.length-1 ; i++){
            int minimum = i;

            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[j] < arr[minimum]){
                    minimum = j;
                }
            }

            if(minimum != i){
                int temp = arr[i];
                arr[i] = arr[minimum];
                arr[minimum] = temp;
            }
        }
    }

    static void display(int []arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []array = {7 , 8 , 3 , 1 , 2};
        sortedArray(array);
        display(array);
    }
}
