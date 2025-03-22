
import java.util.Scanner;

class numberformatexception{

    public static void generateexceptions(String text){
        int number = Integer.parseInt(text);
        System.out.println(number);
    }
    public static void handleexception(String text){
        try{
            int number = Integer.parseInt(text);
            System.out.println(number); 
        }catch(NumberFormatException e){
            System.out.println("Number format exception"+ e);
        }catch(RuntimeException e){
            System.out.println("Runtime Error");
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String text = ip.nextLine();
        
        
        // Calling the method that generates an exception
        System.out.println("Generating exception...");
        try {
            generateexceptions(text);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        
        // Calling the method that handles the exception
        System.out.println("Handling exception...");
        handleexception(text);
        
    }
}