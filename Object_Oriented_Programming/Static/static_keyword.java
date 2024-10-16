package Object_Oriented_Programming.Static;

class Phones {
    String brand;
    int price;
    static String category;

    void display() {
        System.out.println("The brand of the phone is " + brand + " of price " + price + " which is a " + category);
    }
}
public class static_keyword {
    public static void main(String[] args) {
        Phones phone1 = new Phones();
        Phones.category = "Tablet";
        phone1.brand = "Samsung";
        phone1.price = 150000;

        Phones phone2 = new Phones();
        phone2.brand = "Apple";
        phone2.price = 170000;

        phone1.display();
        phone2.display();
    }
}
