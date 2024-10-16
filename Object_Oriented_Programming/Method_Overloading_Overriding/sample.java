package Object_Oriented_Programming.Method_Overloading_Overriding;

class Number {
    void number(int n){
        System.out.println("Method");
    }
    void number(double n){
        System.out.println("Method overloading");
    }
}

class newNumber extends Number {
    @Override
    void number(int n) {
        System.out.println("Method override");
    }
}

public class sample {

}
