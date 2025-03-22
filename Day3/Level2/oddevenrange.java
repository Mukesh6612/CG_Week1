import java.util.*;
class oddevenrange{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                System.out.println(i +" is Even");
            }
            else{
                System.err.println(i+" is Odd");
            }
        }
    }
}