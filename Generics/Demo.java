package Generics;

public class Demo {
    public static void main(String[] args) {
        DemoBox<String> Object1 = new DemoBox<String>();
        Object1.setItem("Rahul");
        System.out.println(Object1.display());

        DemoBox<Integer> Object2 = new DemoBox<Integer>();
        Object2.setItem(12);
        System.out.println(Object2.display());

        DemoBox<Employee> Object3 = new DemoBox<Employee>();
        Object3.setItem(new Employee("Ravi" , 36));

        System.out.println(Object3.display());
    }
}
