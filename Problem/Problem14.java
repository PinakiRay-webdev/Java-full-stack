package Problem;

public class Problem14 {
    public static int getMissing(int[] array){
        int sum = 0;
        int n = array.length+1;
        for(int i : array){
            sum += i;
        }

        int actualSum = (n * (n + 1))/2;

        return actualSum - sum;
    }
    public static void main(String [] args){
        int []array = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(getMissing(array));
    }
}
