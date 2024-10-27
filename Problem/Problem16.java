package Problem;

public class Problem16 {
    public static boolean checkPalindrome(String str) {
        for(int i=0 , j=str.length()-1 ; i<=j ; i++ , j--) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome("ABCDCBA"));
    }
}
