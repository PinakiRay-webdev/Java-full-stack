package Problem;

public class Problem11 {
    public static int maxSum(int []array){
        int currentSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<array.length ; i++){
            currentSum += array[i];
            max = Math.max(currentSum , max);
            if(currentSum < 0){
                currentSum = 0;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int []array = {-1, -2, -3, -4};
        System.out.println(maxSum(array));
    }
}
