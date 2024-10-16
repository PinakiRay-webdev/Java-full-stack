package Object_Oriented_Programming.Static;

class Vehicle {

    static String company;

    static {
        company = "BMW";
        System.out.println("The name of the company is "+company);
    }

    public Vehicle (String name , String type){
        System.out.println("The name of the vehicle is " + name + " which is a "+type);
    }
}
public class static_block {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("bmw 7 series" , "sedan");
        Vehicle v2 = new Vehicle("bmw x7", "suv");
    }
}
