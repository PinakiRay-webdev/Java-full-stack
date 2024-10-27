package Problem;

import java.util.ArrayList;

class LeaderArray {

    public int sumOfArray(int []array , int start){
        int sum = 0;
        for(int i=start ; i<array.length ; i++){
            sum += array[i];
        }

        return sum;
    }
    public ArrayList<Integer> getLeaderElements(int []array)
    {
        ArrayList<Integer> leaderArray = new ArrayList<>();

        for(int i=0 ; i<array.length ; i++){
            if(array[i] >= sumOfArray(array , i+1))
            {
                leaderArray.add(array[i]);
            }
        }
        return leaderArray;
    }
}
public class Problem4 {
    public static void main(String[] args) {
        LeaderArray leaderArray = new LeaderArray();
        int []array = {63, 70, 80, 33, 47, 20};
        System.out.println(leaderArray.getLeaderElements(array));
    }
}
