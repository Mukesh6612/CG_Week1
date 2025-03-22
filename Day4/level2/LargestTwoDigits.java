import java.util.Arrays;
import java.util.Scanner;
class LargestTwoDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                digits = Arrays.copyOf(digits, maxDigit); 
            }
            digits[index++] = temp % 10;
            temp /= 10;
        }
        if (index == 0) {
            System.out.println("No digits found!");
            return;
        }
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("\nDigits stored in the array: " + Arrays.toString(Arrays.copyOf(digits, index)));
        System.out.println("Largest digit: " + largest);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
    }
}
