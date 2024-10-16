package Object_Oriented_Programming.Inheritance.SuperKeyword;
class A {
    public A () {
        System.out.println("This is default constructor of A");
    }

    public A (int n) {
        System.out.println("This is the parameterized constructor of A");
    }
}

class B extends A {
    public B () {
        System.out.println("This is the default constructor of B");
    }

    public B (int n) {
        this(); //it will call the constructor of the same class
        System.out.println("This is the parameterized constructor of B");
    }
}

public class sample {
    public static void main(String[] args) {
        B b = new B(4);
    }
}
