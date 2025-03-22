import java.util.*;
class uppertolower{

    public static String tolower(String text){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch >= 'A' && ch <= 'Z' ){
                ch = (char)(ch+32);
            }
            result.append(ch);
        }
        return  result.toString();
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
        String manualLowercase = tolower(text);
        String builtInLowercase = text.toLowerCase();
        
        // Compare results
        boolean isSame = comparestring(manualLowercase, builtInLowercase);
        
        // Display results
        System.out.println("Manual conversion result: " + manualLowercase);
        System.out.println("Built-in conversion result: " + builtInLowercase);
        System.out.println("Do both results match? " + isSame);
        
    }
}