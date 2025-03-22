import java.util.Scanner;
 
public class UniqueCharacters {
   public static int findLength(String text) {
   	int length = 0;
   	try {
       	while (true) {
               text.charAt(length);
               length++;
       	}
   	} catch (Exception e) {
   	}
   	return length;
   }
 
   public static char[] findUniqueCharacters(String text) {
   	int length = findLength(text);
   	char[] uniqueChars = new char[length];
   	int uniqueCount = 0;
 
   	for (int i = 0; i < length; i++) {
       	char currentChar = text.charAt(i);
       	boolean isUnique = true;
      	
       	for (int j = 0; j < uniqueCount; j++) {
               if (uniqueChars[j] == currentChar) {
                   isUnique = false;
                   break;
               }
       	}
      	
       	if (isUnique) {
               uniqueChars[uniqueCount] = currentChar;
               uniqueCount++;
       	}
   	}
  	
   	char[] result = new char[uniqueCount];
   	for (int i = 0; i < uniqueCount; i++) {
           result[i] = uniqueChars[i];
   	}
   	return result;
   }
 
   public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);
   	System.out.print("Enter a string: ");
   	String text = scanner.nextLine();
   	scanner.close();
 
   	char[] uniqueChars = findUniqueCharacters(text);
  	
   	System.out.print("Unique characters: ");
   	for (char c : uniqueChars) {
       	System.out.print(c + " ");
   	}
   }
}