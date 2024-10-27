package Problem;

public class Problem15 {
    static int getAmountOfWater(int []array , int n){
        int []left = new int[n];
        int []right = new int[n];
        int water  = 0;

        left[0] = array[0];
        for(int i=1 ; i<n ; i++){
            left[i] = Math.max(left[i-1] , array[i]);
        }

        right[n-1] = array[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            right[i] = Math.max(right[i+1] , array[i]);
        }

        for(int i=0 ; i<n ; i++){
            water += Math.min(left[i] , right[i]) - array[i];
        }
        return water;
    }
    public static void main(String[] args) {
        int []array = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(getAmountOfWater(array , array.length));
    }
}
