
import java.util.Scanner;

class lengthofthestring{

    public static int lenofstring(String text){
        int count = 0;
        try {
            while (true) { 
                text.charAt(count);
                count++;
            }
        } catch(IndexOutOfBoundsException e){
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String text = ip.next();
        int length = lenofstring(text);
        int builtinlength = text.length();

        System.out.println(length);
        System.out.println(builtinlength);
    }
}