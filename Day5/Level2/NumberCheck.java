import java.util.*;
class NumberCheck{
    public static boolean isPostive(int numbers){
        if(numbers<0){
            return false;
        }
        return true;
    }
    public static boolean isPrime(int numbers){
        if(numbers<0){
            return false;
        }
        for(int i=2;i<Math.sqrt(numbers);i++){
            if(numbers%i==0){
                return false;
            }
        }
        return true;
    }
    public static void Compare(int firstNumber,int LastNumber){
        if(firstNumber>LastNumber){
            System.out.println("First number is greater");
        }
        else if(firstNumber==LastNumber){
            System.out.println("First number and Lastnumber both are equal");
        }
        else{
            System.out.println("Last number is greater");
        }
    }
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int[] number=new int[5];
    for(int i=0;i<number.length;i++){
        System.out.println("Enter the number of index "+i);
        number[i]=input.nextInt();
    }
    int firstNumber=number[0];
    int LastNumber=number[number.length-1];
    for(int i=0;i<number.length;i++){
        boolean result=isPostive(number[i]);
        if(result){
            System.out.println("The "+number[i]+" is positive");
            boolean res=isPrime(number[i]);
            if(res){
                System.out.println("The "+number[i]+" is a prime number");
            }
        }
    }
    Compare(firstNumber,LastNumber);
    }
}