import java.util.Scanner;
class sumofnaturalnumber{
    public static int naturalnumbers(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();
        int result = naturalnumbers(number);
        System.out.println(result);
    }
    
}