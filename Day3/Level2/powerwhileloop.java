import java.util.*;
class powerwhileloop{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();
        int power = ip.nextInt();
        int result = 1;
        while(power>0){
            result *= number;
            power--;
        }
        System.out.println(result);
    }
}