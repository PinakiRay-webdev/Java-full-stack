package Problem;

public class Problem14 {
    public static int getMissing(int[] array){
        int sum = 0;

        int n = array.length + 1;

        //changing the value of n if array contains 0
        for(int i : array){
            if(i == 0){
                n = array.length;
                break;
            }
        }
        for(int i : array){
            sum += i;
        }

        int actualSum = (n * (n + 1))/2;

        return actualSum - sum;
    }
    public static void main(String [] args){
        int []array = {1,2,4,5,6};
        System.out.println(getMissing(array));
    }
}
