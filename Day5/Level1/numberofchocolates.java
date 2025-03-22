
import java.util.Scanner;

class numberofchocolates{
    public static int[] findRemainderAndQuotient(int numberOfchocolates, int numberofchildrens){
        int eachchild = numberOfchocolates/numberofchildrens;
        int remainingchocolates = numberOfchocolates%numberofchildrens;
        return new int[]{eachchild, remainingchocolates}; 

    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int numberOfchocolates = ip.nextInt();
        int numberofchildrens = ip.nextInt();
        int[] result = findRemainderAndQuotient(numberOfchocolates, numberofchildrens);
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

    }
}