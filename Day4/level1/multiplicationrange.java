import java.util.*;
class multiplicationrange{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] array = new int[10];
        int i = 0;
        int product = 1;
        for (i = 0; i < 10; i++) {
            array[i] = ip.nextInt();
        }
        int number = ip.nextInt();
        for (i = 0; i < 10; i++) {
            product= number * array[i];
            System.out.println(product);
        }
        
    }
}