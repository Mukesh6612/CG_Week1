import java.util.*;
class primenumber{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int number=input.nextInt();
    boolean isPrime=true;
    if(number>0){
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
            isPrime=true;
        }
    if(isPrime){
        System.out.println(number+" is a prime number");
    }
    else{
        System.out.println(number+" is not a prime number");
    }
    }
    else{
        System.out.println(number+" is not a prime number");
    }
    }
}