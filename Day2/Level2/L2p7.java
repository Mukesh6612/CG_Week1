import java.util.*;
class L2p7{
   public static void main(String[] args){
       Scanner ip=new Scanner(System.in);
       int number1=ip.nextInt();
       int number2=ip.nextInt();
       number1=number1+number2;
       number2=number1-number2;
       number1=number1-number2;
       System.out.print("The swapped numbers are "+number1+" and "+number2);
   }
}