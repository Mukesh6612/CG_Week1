import java.util.*;
class factorialforloop{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int fact = 1;
        int i = 1;
        if (n > 0){
            for(i = n; i >= 1; i--){
                fact = fact * i;

            }
            System.out.println(fact);
        }
    }
}
