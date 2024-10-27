package DSA.Searching.Binary;

public class Demo {
    public static void main(String[] args) {
        int []array = {2 , 4 , 5 , 6 , 8};
        int key = 8;
        int start = 0;
        int end = array.length-1;
        int place = -1;

        while(start <= end){

            int mid = (start + end)/2;

            if(key == array[mid])
            {
               place = mid;
               break;
            } else if(key < array[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        System.out.println((place == -1) ? "Not available" : "Element is present at the index of "+place);
    }
}
