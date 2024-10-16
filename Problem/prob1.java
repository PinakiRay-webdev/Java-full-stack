package Problem;

class RatCount {
    public int countFood(int r , int unit , int []arr){
        int totalFood = r * unit;
        int sum = 0;
        int count=0;
        for(int i=0 ; i<=arr.length ; i++){
            sum += arr[i];
            count++;
            if(sum >= totalFood){
                break;
            }
        }

        return count;
    }
}

public class prob1 {
    public static void main(String[] args) {
        int []array = {2, 8, 3, 5, 7, 4, 1, 2};
        int r = 7;
        int unit = 2;

        RatCount rc = new RatCount();
        System.out.println(rc.countFood(r , unit , array));
    }
}
