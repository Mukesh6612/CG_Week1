import java.util.*;
class multiplication{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int size = ip.nextInt();
        int[] array = new int[size+1];

        for (int i = 1; i <= size+1; i++) {

            array[i] = n * i;
            System.out.println(array[i]);
        }

    }
}