
import java.util.Scanner;

class uppercase{

    public static String lowertoupper(String text){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if(ch >= 'a' && ch<= 'z'){
                ch = (char)(ch-32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    public static boolean comparestring(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String text = ip.nextLine();
        String builtin = text.toUpperCase();
        String manual = lowertoupper(text);
        boolean isequal = comparestring(builtin, manual);

        System.out.println(builtin);
        System.out.println(manual);
        System.out.println(isequal);



    }
}