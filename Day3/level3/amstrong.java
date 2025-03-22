import java.util.*;
class armstrong{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int number=input.nextInt();
    int num=number;
    int result;
    int sum=0;
    while(num>0){
        result=num%10;
        sum+=result*result*result;
        num=num/10;
    }
    if(sum==number){
        System.out.println("It is an ArmStrong number");
    }else{
        System.out.println("It is not an ArmStrong number");
    }
    }
}
