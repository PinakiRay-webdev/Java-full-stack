package ExceptionHandling.Sample3;
public class sample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        try{
            if(b==0){
                throw new ArithmeticException("Denominator cannot be zero");
            }
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("Thanks for using this app");
    }
}
