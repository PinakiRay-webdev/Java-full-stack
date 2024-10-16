package Object_Oriented_Programming.Inheritance;

class Box {
    String size = "12 x 6";
}

class MatchSticks extends Box {
    void display(){
        System.out.println("The size of the match box is " + size);
    }
}
public class inheritance {
    public static void main(String[] args) {
        MatchSticks ms = new MatchSticks();
        ms.display();
    }
}
