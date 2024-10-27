//find min element in an rotated sorted array using binary search
package Problem;

public class Problem7 {
    static int findMin(int []arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            if(arr[start] < arr[end]){
                return arr[start];
            }
            int mid = (start+end)/2;

            if(arr[mid] < arr[mid+1] ){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
    public static void main(String[] args) {
        int []array = {10,8,6,2,4};
        System.out.println(findMin(array));
    }
}
