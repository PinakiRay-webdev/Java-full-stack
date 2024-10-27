package Object_Oriented_Programming.InnerClass;


class A {
    public void show(){
        System.out.println("In show now");
    }

    class B {
        public void config(){
            System.out.println("In config no]w");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();
    }
}
