import java.util.Scanner;
public class TrimStringUsingCharAt {
    public static int[] trimSpaces(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String userInput = input.nextLine();
        int[] indices = trimSpaces(userInput);
        String manuallyTrimmed = createSubstring(userInput, indices[0], indices[1]);
        String builtInTrimmed = userInput.trim();
        boolean areEqual = compareStrings(manuallyTrimmed, builtInTrimmed);
        System.out.println("Manually Trimmed String: \"" + manuallyTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both results the same? " + areEqual);
    }
}
