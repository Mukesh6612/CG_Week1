import java.util.*;
class splitstring{
    public static int lenghtofstring(String text){
        int length = 0;
        for(char c : text.toCharArray()){
            length++;
        }
        return length;
    }
    public static String[] customsplit(String text){
        int length = lenghtofstring(text);
        int spacecount = 0;

        for(int i = 0; i<length;i++ ){
            if(text.charAt(i) == ' '){
                spacecount++;
            }
        }
        String[] words = new String[spacecount + 1];
        int start = 0, wordIndex = 0;
        for (int i = 0; i < length; i++) {
            if(text.charAt(i) == ' '){
                words[wordIndex++] = text.substring(start,i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start);
        return words;
    }

    public static boolean compareArrays(String[] arr1,String[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String text = ip.nextLine();
        String[] builtInSplit = text.split(" ");
        for (String word : builtInSplit) {
            System.out.println(word);
        }
        String[] manualSplit = customsplit(text);
        for (String word : manualSplit) {
            System.out.println(word);
        }
        boolean isequal = compareArrays(builtInSplit, manualSplit);
        System.out.println(isequal);

    }
}