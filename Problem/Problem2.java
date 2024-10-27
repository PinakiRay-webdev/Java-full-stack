package Problem;

class ReverseString{
    public ReverseString(String str){
        StringBuffer sb = new StringBuffer();
        for(int i = str.length()-1  ; i>=0 ; i--){
            sb.append(str.charAt(i));
        }

        System.out.println(sb);
    }
}

public class Problem2 {
    public static void main(String[] args) {
        new ReverseString("Rohan");
    }
}
