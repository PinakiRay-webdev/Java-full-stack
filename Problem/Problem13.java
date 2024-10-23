package Problem;

public class Problem13 {
    static int [] mergeSortedArray(int []arr1 , int []arr2){
        int lengthOfArray1 = arr1.length;
        int lengthOfArray2 = arr2.length;

        int []mergedArray = new int[lengthOfArray1 + lengthOfArray2];

        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                mergedArray[k++] = arr1[i++];
            }else{
                mergedArray[k++] = arr2[j++];
            }
        }

        while(i<lengthOfArray1){
            mergedArray[k++] = arr1[i++];
        }

        while(j<lengthOfArray2){
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    static void display(int []array){
        for(int i : array){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []array1 = {1, 3, 4, 5};
        int []array2 = {2, 4, 6, 8};

        display(mergeSortedArray(array1 , array2));
    }
}
