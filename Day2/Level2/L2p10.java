import java.util.*;
class L2p10{
   public static void main(String[] args){
   Scanner input=new Scanner(System.in);
   int numberOfChildren=input.nextInt();
   int numberOfChocolates=input.nextInt();
   int ChocolatePerStudent=numberOfChocolates/numberOfChildren;
   int remainingChocolates=numberOfChocolates%numberOfChildren;
   System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d",
   ChocolatePerStudent,remainingChocolates);
   }
}