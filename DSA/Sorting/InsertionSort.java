package DSA.Sorting;

public class InsertionSort {
    static void sortedArray(int []arr , int n)
    {
        for(int i=1 ; i<n ; i++){
            int j=i-1;
            int currentElement = arr[i];

            while(j>=0 && arr[j] > currentElement){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = currentElement;
        }
    }

    static void display(int []arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
            int []array = {8, 5, 7, 56, 3, 2};
            sortedArray(array , array.length);
            display(array);
    }
}
