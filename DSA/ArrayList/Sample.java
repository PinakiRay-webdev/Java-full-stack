package DSA.ArrayList;

import java.util.ArrayList;
import java.util.List;

class Employee{
    String name;
    int age;
    public Employee(String name , int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name of employee is "+name+" of having age of "+age;
    }

}
public class Sample {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Rohan" , 15));
        al.add(new Employee("Rishab" , 15));
        al.add(new Employee("Rahul" , 12));

        for(Employee employee : al){
            System.out.println(employee);
        }
    }
}
