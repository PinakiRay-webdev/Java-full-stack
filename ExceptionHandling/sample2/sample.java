//By specifying the type of exception we can handle different exception
package ExceptionHandling.sample2;

public class sample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int []array = {10,20,30,40,50};
        try{
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println(e);
        }

        try{
            for(int i=0; i<array.length+1 ; i++){
                System.out.println(array[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("Thanks for using the app");
    }

}
