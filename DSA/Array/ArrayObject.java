package DSA.Array;
class Student {
    int marks;
    String name;
}
public class ArrayObject {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Rohan";
        s1.marks = 69;
        s2.name = "Rahul";
        s2.marks = 89;
        s3.name = "Ajay";
        s3.marks = 99;

        Student [] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(Student student : students){
            System.out.println(student.name+" : "+student.marks);
        }
    }
}
