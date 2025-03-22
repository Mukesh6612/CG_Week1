
import java.util.Scanner;

class returncharacters{
    public static char[] tochararrray(String text){
        char[] chararray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chararray[i] = text.charAt(i);           
        }
        return chararray;
    }
    public static boolean compare(char [] arr1,char[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String text = ip.next();
        char[] chararray1 = tochararrray(text);
        char[] chararray2 = text.toCharArray();
        boolean isequal = compare(chararray1, chararray2);

        System.out.println(chararray1);
        System.out.println(chararray2);
        System.out.println(isequal);
    }
}