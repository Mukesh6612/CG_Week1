import java.util.*;
class fizzbuzzwhile{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int i = n;
        if (n > 0){
            while(i<0){
                if(i%3==0 && i%5==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                else if(i%3 == 0){
                    System.out.println("FizzBuzz");
                }
            i--;
            }
        }
        else{
            System.out.println("Enter positive number");
        }
    }
}