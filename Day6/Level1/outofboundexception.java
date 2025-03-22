
import java.util.Scanner;
class outofboundexception{

    public static void exception(String text){
        System.out.println("Accessing character at index " + text.length()); 
        System.out.println(text.charAt(text.length()));
    }

    public static void handleexception(String text){
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }


    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String text = ip.next();
        handleexception(text);
    }
}
