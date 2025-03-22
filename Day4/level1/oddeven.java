import java.util.*;
class oddeven{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();
        int evensize = number/2 +1;
        int oddsize = number/2 + 1;
        int[] even = new int[evensize];
        int[] odd = new int[oddsize];
        int oddindex = 0;
        int evenindex = 0;
        if(number <=0){
            System.out.println("Error");
            System.exit(0);
        }
        for (int i = 1; i <= number; i++) {
            if(i%2==0){
                even[evenindex] = i;
                evenindex++;
            }
            else{
                odd[oddindex] = i;
                oddindex++;
            }
        }
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddindex ; i++) {
                System.out.println("odd:"+ odd[i]);
            }
        System.out.print("Even Numbers:");
        for(int i = 0; i < evenindex; i++){
                System.out.println("Even:"+even[i]);
        }
    }
}