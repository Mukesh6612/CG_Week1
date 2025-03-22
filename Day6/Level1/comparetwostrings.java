
import java.util.Scanner;

class comparetwostrings{
    public static boolean compare(String text1, String text2){
        if(text1.length() != text2.length()){
            return false;
        }
        for (int i = 0; i < text1.length(); i++) {
            if(text1.charAt(i) != text2.charAt(i)){
                return false;
            }
        }
        return true;
        }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String text1 = ip.next();
        String text2 = ip.next();
        boolean result = compare(text1,text2);
        System.out.println(result);
    }
}