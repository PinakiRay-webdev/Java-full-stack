package Threading;

class A extends Thread {
    public void run(){
        for(int i=0 ; i<100 ; i++){
            System.out.println("h1");
        }
    }
}

class B extends Thread {
    public void run(){
        for(int i=0 ; i<100 ; i++){
            System.out.println("Hello");
        }
    }
}
public class sample {
    public static void main(String[] args){
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}
