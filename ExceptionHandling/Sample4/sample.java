package ExceptionHandling.Sample4;

class MyCustomException extends Exception{
    public MyCustomException(String str){
        super(str);
    }
}
public class sample {
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try{
            if(b==0){
                throw new MyCustomException("Denominator cannot be zero");
            }
            System.out.println(a/b);
        }catch (MyCustomException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Thanks for using this app");
    }
}
