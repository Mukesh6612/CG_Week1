import java.util.*;
class fizzbuzz{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        if(n>0){
            for (int i = 1; i <= n ; i++) {
                if((i%3==0) && (i%5==0)){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                else if(i%3 == 0){
                    System.out.println("FizzBuzz");
                }
            }
        }
        else{
            System.out.println("Enter positive number");
        }


    }
}