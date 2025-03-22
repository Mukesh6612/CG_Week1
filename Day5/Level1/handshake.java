import java.util.*;
class handshake{
    public static int noofhandshakes(int number){
        int handshakes = (number*(number-1))/2;
        return handshakes;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();
        int result = noofhandshakes(number);
        System.out.println("No.of Handshakes is "+ result);
    }
}