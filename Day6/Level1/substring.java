
import java.util.Scanner;

class substring{

    public static String substring(String text,int startindex,int endindex){
        StringBuilder result = new StringBuilder();
        for (int i = startindex; i < endindex; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static boolean compare(String str1,String str2){
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
        String text = ip.next();
        int startindex = ip.nextInt();
        int endindex = ip.nextInt();

        String substring1 = substring(text, startindex, endindex);
        String substring2 = text.substring(startindex, endindex);

        boolean isequal = compare(substring1, substring2);

        System.out.println("Substring using charAt(): " + substring1);
        System.out.println("Substring using substring(): " + substring2);
        System.out.println("Are both substrings equal? " + isequal);
    }
}