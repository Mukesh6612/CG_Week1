import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] frequency = new int[10];
        int temp = Math.abs(number); 
        while (temp > 0) {
            int digit = temp % 10; 
            frequency[digit]++;     
            temp /= 10;             
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { 
                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
            }
        }
    }
}
