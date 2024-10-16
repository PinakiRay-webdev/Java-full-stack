package DSA.Searching.Linear;

public class Demo {
    public static void main(String[] args){
        int []array = {12 , 4 , 2 , 56 , 3};
        int place = 0;
        for(int i=0 ; i<array.length ; i++){
            if(array[i] == 2){
                place = i;
                break;
            }
        }

        System.out.println("The element is present at index "+place);
    }
}
