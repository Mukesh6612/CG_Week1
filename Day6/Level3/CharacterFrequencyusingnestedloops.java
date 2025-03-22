import java.util.Scanner;

public class CharacterFrequencyusingnestedloops {
   public static String[][] findCharacterFrequency(String text) {
       char[] chars = text.toCharArray();
       int[] freq = new int[chars.length];
      
       for (int i = 0; i < chars.length; i++) {
           if (chars[i] == '0') continue;
           freq[i] = 1;
           for (int j = i + 1; j < chars.length; j++) {
               if (chars[i] == chars[j]) {
                   freq[i]++;
                   chars[j] = '0';
               }
           }
       }
      
       int uniqueCount = 0;
       for (int f : freq) {
           if (f > 0) uniqueCount++;
       }
      
       String[][] result = new String[uniqueCount][2];
       int index = 0;
       for (int i = 0; i < chars.length; i++) {
           if (freq[i] > 0) {
               result[index][0] = Character.toString(chars[i]);
               result[index][1] = Integer.toString(freq[i]);
               index++;
           }
       }
       return result;
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String text = scanner.nextLine();
       scanner.close();
      
       String[][] result = findCharacterFrequency(text);
       System.out.println("Character Frequency:");
       for (String[] pair : result) {
           System.out.println(pair[0] + ": " + pair[1]);
       }
   }
}