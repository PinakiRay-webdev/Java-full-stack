package String;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Rohan");
        System.out.println(sbf);

        sbf.append(" Ray");
        System.out.println(sbf);

        sbf.insert(0 , "Mr. ");
        System.out.println(sbf);
    }
}
