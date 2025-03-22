
import java.util.Scanner;

class shortestandlongestword{
    public static String[] splitText(String text){
        String[] words = new String[text.length()];
        int wordIndex = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch != ' '){
                word += ch;
            }else if (!word.isEmpty()){
                words[wordIndex++] = word;
                word = "";
            }
        }
        if(!word.isEmpty()){
            words[wordIndex++] = word;
        }
        String[] result = new String[wordIndex];
        System.arraycopy(words,0, result, 0, wordIndex);
        return result;
    }

    public static int findlength(String str){
        int count = 0;
        for(char ch : str.toCharArray()){
            count++;
        }
        return count;
    }
    public static String[][] wordlengthArray(String[] words){
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findlength(words[i]));
        }
        return result;
    }
    public static String[] findshortestlongest(String[][] wordData){
        String shortest =wordData[0][0];
        String longest = wordData[0][0];
        for(String[] row : wordData){
            if (findlength(row[0]) < findlength(shortest)) {
                shortest = row[0];
            }
            if (findlength(row[0]) > findlength(longest)) {
                longest = row[0];
            }
        }
        return new String[]{shortest,longest};
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = ip.nextLine();
        
        String[] words = splitText(input);
        String[][] wordData = wordlengthArray(words);
        String[] minMaxWords = findshortestlongest(wordData);
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
        
        System.out.println("\nShortest word: " + minMaxWords[0]);
        System.out.println("Longest word: " + minMaxWords[1]);
    }
}