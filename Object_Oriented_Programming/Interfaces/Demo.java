package Object_Oriented_Programming.Interfaces;


interface A{
    void Work();
}

class B implements A{
    @Override
    public void Work() {
        System.out.println("This is the work");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.Work();
    }
}
