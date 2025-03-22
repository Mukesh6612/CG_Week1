import java.util.*;
class oddoreven{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        for(int i = 1; i <=n; i++ ){
            if (i %2 == 0){
                System.out.println(i + " is even");
            }
            else{
                System.out.println(i + " is odd");
            }
        }

    }
}