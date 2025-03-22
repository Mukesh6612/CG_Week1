import java.util.Scanner;
public class TextProcessor {
    public static String[] splitText(String text) {
        String[] words = new String[text.length()];
        int wordIndex = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.isEmpty()) {
                words[wordIndex++] = word;
                word = "";
            }
        }
        if (!word.isEmpty()) {
            words[wordIndex++] = word;
        }
        
        String[] result = new String[wordIndex];
        System.arraycopy(words, 0, result, 0, wordIndex);
        return result;
    }
    public static int findLength(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            count++;
        }
        return count;
    }
    public static String[][] wordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String[] words = splitText(input);
        String[][] wordData = wordLengthArray(words);
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
