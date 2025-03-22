import java.util.Scanner;

public class VowelConsonantCheker {
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch); 
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    public static String[][] analyzeString(String input) {
        String[][] result = new String[input.length()][2];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result[i][0] = Character.toString(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }
    public static void displayResult(String[][] result) {
        System.out.println("Character\tType");
        System.out.println("----------------");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = ip.nextLine();
        String[][] result = analyzeString(input);
        displayResult(result);
    }
}
