import java.util.Scanner;
 
public class CharacterFrequencys{
   public static char[] findUniqueCharacters(String text) {
   	char[] uniqueChars = new char[text.length()];
   	int uniqueCount = 0;
  	
   	for (int i = 0; i < text.length(); i++) {
       	char currentChar = text.charAt(i);
       	boolean isUnique = true;
       	for (int j = 0; j < uniqueCount; j++) {
               if (uniqueChars[j] == currentChar) {
                   isUnique = false;
                   break;
               }
       	}
       	if (isUnique) {
               uniqueChars[uniqueCount++] = currentChar;
       	}
   	}
   	char[] result = new char[uniqueCount];
   	System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
   	return result;
   }
 
   public static int[][] findCharacterFrequency(String text) {
   	int[] frequency = new int[256];
   	for (int i = 0; i < text.length(); i++) {
           frequency[text.charAt(i)]++;
   	}
  	
   	char[] uniqueChars = findUniqueCharacters(text);
   	int[][] result = new int[uniqueChars.length][2];
   	for (int i = 0; i < uniqueChars.length; i++) {
           result[i][0] = uniqueChars[i];
           result[i][1] = frequency[uniqueChars[i]];
   	}
   	return result;
   }
 
   public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);
   	System.out.print("Enter a string: ");
   	String text = scanner.nextLine();
   	scanner.close();
 
   	int[][] result = findCharacterFrequency(text);
   	System.out.println("Character Frequency:");
   	for (int[] pair : result) {
       	System.out.println((char) pair[0] + ": " + pair[1]);
   	}
   }
}