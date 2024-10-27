package Object_Oriented_Programming.Final_Keyword;


class Calculator{
    //it has some methods
    public int Add(int a , int b){
        return a + b;
    }

    public final void greet(){ //final method means you cannot override the method inside child class
        System.out.println("Thanks for using");
    }
}

class AdvanceCalculator extends Calculator{
    @Override
    public int Add(int a , int b){
        return super.Add(a , b);
    }


    public void Square(int a){
        System.out.println("The Square of a is "+Math.pow(a , 2));
    }
}

final class Description { //final class means you cannot inherit the class
    public Description(){
        System.out.println("Welcome to the calculator app");
    }
}

public class Demo {
    public static void main(String[] args) {
        final int num = 10; //final variable means you cannot change the value of the variable

        new Description();
        AdvanceCalculator ac = new AdvanceCalculator();
        System.out.println("The addition of a and b is "+ac.Add(10 , 5));
        ac.Square(6);
    }
}
