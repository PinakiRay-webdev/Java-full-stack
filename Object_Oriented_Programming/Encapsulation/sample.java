package Object_Oriented_Programming.Encapsulation;

class Human {
    int age;
    String name;
    private int salary = 12000;

    public int getSalary(){
        return salary;
    }
}
public class sample {
    public static void main(String[] args) {
        Human human = new Human();
        human.age = 12;
        human.name = "Rohan";
        System.out.println("The salary of the person is "+human.getSalary());
    }
}
