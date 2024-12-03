package ExceptionHandling.Sample4;

class MycustomException extends Exception{
    public MycustomException(String str){
        super(str);
    }
}
public class sample {
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try{
            if(b == 0){
                throw new MycustomException("Denominator cannot be zero");
            }
            System.out.println(a/b);
        }catch (MycustomException e){
            System.out.println(e.getMessage());
        }
    }
}
