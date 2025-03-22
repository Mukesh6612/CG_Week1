import java.util.Scanner;
class division{
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient =  number/divisor;
        int remainder = number%divisor;
        return new int[]{quotient,remainder};
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number =ip.nextInt();
        int divisor = ip.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: "+result[0]);
        System.out.println("Remainder: "+result[1]);
    }
}