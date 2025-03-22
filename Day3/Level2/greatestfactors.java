import java.util.*;
class greatestfactors{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int greatestfactor = 1;
        for (int i = n - 1; i >0; i--) {
            if(n%i==0){
                greatestfactor = i;
                break;
            }
        }
        System.out.println(greatestfactor);
    }
}