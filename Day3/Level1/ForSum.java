import java.util.*;
class ForSum{
 public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
 int number=input.nextInt();
 int i;
 int temp = number;
 int sum=0;
 if(number>0){
    for( i=number;i>=1;i--){
        sum+=i;
    }
 int total=(temp*(temp+1))/2;
 if(sum==total){
 System.out.println("yes");
 }
 else{
 System.out.println("None");
 }
 }
 else{
 System.out.println("Not a Natural number");
 }
 }
}