package Object_Oriented_Programming.Abstract_Class;

abstract class Car {
    public abstract void drive();

    public void playMusis() {
        System.out.println("Playing music...");
    }
}

class BMW extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}

public class Demo {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.drive();
        bmw.playMusis();
    }
}
