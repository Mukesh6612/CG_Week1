
import java.util.Scanner;

class multiplicationtable{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        if (n>= 6 && n <= 9){
            for (int i = 1; i<= 10; i++){
                System.out.println(n +" X " + i +" = "+ n*i);
            }
        }
    }
}