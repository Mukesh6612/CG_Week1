import java.util.*;
class minmax{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number =ip.nextInt();
        int temp = number;
        int maxdigit =10;
        int[] array = new int[number];
        int i = 0;
        while(temp>0){
            int digit = temp%10;
            array[i] = digit;
            temp = temp/10;
            if (maxdigit == i) break;
            i++;
        }
        int largest = array[0];
        int secondlargest = array[0];
        for (i = 0; i < number; i++) {
            if (array[i]>largest){
                secondlargest = largest;
                largest = array[i];
            }
            if (array[i] > secondlargest && array[i] != largest ){
                secondlargest = array[i];

            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest:" +secondlargest);
    }
}