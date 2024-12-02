package ExceptionHandling.sample1;

public class sample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; //trying to create a runtime exception (unchecked exception)
        try{
            System.out.println(a / b);
        }catch (Exception e){
            System.out.println("Error: Cannot divide by zero");
        }

        System.out.println("Thanks for using this app");
    }
}
