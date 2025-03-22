import java.util.*;
class L2p12{
   public static void main(String[] args){
   Scanner input=new Scanner(System.in);
   System.out.print("Enter the weight in pounds ");
   double pounds=input.nextDouble();
   double kg=pounds/2.2;
   System.out.printf("The weight of the person in pound is %.2f and in kg is %.2f",pounds,kg);
   }
}