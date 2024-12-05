package Threading.Thread_Priotrity;

import java.beans.IntrospectionException;

class A extends Thread{
    public void run(){
        for(int i=0 ; i<100 ; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run(){
        for(int i=0 ; i<100 ; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class sample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

//        b.setPriority(Thread.MAX_PRIORITY);
//        a.setPriority(Thread.MIN_PRIORITY);

        a.start();
        b.start();
    }
}
