package ExceptionHandling;

public class sample {
    public static void main(String[] args){
        int []array = {10 , 20 , 403 , 3832 , 12};
        try{
            for(int i = 0 ; i<array.length+2 ; i++){ //trying to create an exception
                System.out.println(array[i]);
            }
        }catch(Exception e) {
            System.out.println("Error : "+e);
        } finally {
            System.out.println("Thank you fo using the app");
        }
    }
}
