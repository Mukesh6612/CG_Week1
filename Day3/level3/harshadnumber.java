import java.util.*;
class harshadnumber{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int number=input.nextInt();
    int sum=0;
    int num=number;
    while(num>0){
        num=num%10;
        sum+=num;
        num=num/10;
    }
    if(number%sum==0){
        System.out.println("Harshad number");
    }
    else{
        System.out.println("Not Harsha number");
    }
    }
}
