import java.util.*;
class factorial{
 public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
 int number=input.nextInt();
 int i=number;
 int fact=1;
 if(number>0){
 while(i>0){
 fact*=i;
 i--;
 }
 System.out.print(fact);
 }
 }
}
