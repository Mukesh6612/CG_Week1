
import java.util.Scanner;

class smallestandlargest{
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest = number1;
        int largest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        return new int[]{smallest,largest};
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number1 = ip.nextInt();
        int number2 = ip.nextInt();
        int number3 = ip.nextInt();

        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }
}