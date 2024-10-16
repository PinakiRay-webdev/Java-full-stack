package Object_Oriented_Programming.Constructors;
class Fruit {
    public Fruit() {
        System.out.println("This is the default constructor");
    }

    public Fruit(int a) {
        System.out.println("THis is the parameterized constructor");
    }
}
public class constructors {
    public static void main(String[] args) {
        new Fruit();
        new Fruit(67);
    }
}
