package Object_Oriented_Programming.Static;

class Student {
    String name;
    int age;
    static String school;
    void display(){
        System.out.println(name+" is the name of the student of age "+age);
    }

    static void showSchool() {
        System.out.println("The name of the school is " + school);
    }
}
public class static_method {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name  = "Rohan";
        s1.age = 23;

        Student s2 = new Student();
        s2.name = "Bikash";
        s2.age = 23;

        Student.school = "sssvv";

        s1.display();
        s2.display();
        Student.showSchool();
    }
}
