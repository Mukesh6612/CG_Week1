import java.util.*;
class numberchecking{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int size = ip.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = ip.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if(num[i] > 0){
                System.out.println("Positive");
            }
            else if(num[i] == 0){
                System.out.println("Zero");
            }
            else{
                System.out.println("Negative");
            }
        }

    }
}