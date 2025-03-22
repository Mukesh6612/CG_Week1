import java.util.*;
class L2p11{
   public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   int princple=input.nextInt();
   int rate=input.nextInt();
   int time=input.nextInt();
   int SimpleInterest=(princple*rate*time)/100;
   System.out.printf("The Simple Interest is %d for Principal %d, Rate of Interest %d and Time %d",
   SimpleInterest,princple,rate,time);
   }
}