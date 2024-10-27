package Object_Oriented_Programming.Dynamic_Method_Dispatch;

class Computer{
    void booting(){
        System.out.println("This is the process of booting of computer");
    }
}

class Laptop extends Computer{
    @Override
    void booting() {
        System.out.println("This is the process of booting of laptop");
    }
}

class Notebook extends Computer{
    @Override
    void booting(){
        System.out.println("This is the process of booting of Notebook");
    }
}

public class Demo {
    public static void main(String[] args){
        Computer lap = new Computer();
        lap.booting();

        lap = new Laptop();
        lap.booting();

        lap = new Notebook();
        lap.booting();
    }
}
