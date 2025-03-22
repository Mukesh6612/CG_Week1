import java.util.*;
class naturalSum{
    public static int recursiveSum(int number){
        if(number<=1){
            return number;
        }
        return number+recursiveSum(number-1);
    }
    public static int formualSum(int number){
        int sum=(number*(number+1))/2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=input.nextInt();
        if(recursiveSum(number)==formualSum(number)){
            System.out.println("Sum of natural number "+number+" is "+recursiveSum(number));
        }
    }
}