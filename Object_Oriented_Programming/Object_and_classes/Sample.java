package Object_Oriented_Programming.Object_and_classes;

class Student // this is the class
{
    // this is the property of the object
    String name;
    int marks;

    // this is the behaviour of the class i.e methods
    void study() {
        System.out.println(name+" is studying");
    }
}
public class Sample {
    public static void main(String[] args) {
        Student student = new Student();    //new student object
        student.name = "Rohan";
        student.marks = 89;

        System.out.println("The name of the student is " + student.name);
        System.out.println("The marks of the student is " + student.marks);
        student.study();
    }
}
