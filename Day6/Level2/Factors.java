import java.util.*;
class Factors{
    public static int[] factor(int number){
    int count=0;
    for(int i=1;i<=number;i++){
        if(number%i==0){
            count++;
        }
        }
        int[] digits=new int[count];
        int index=0;
        for(int j=1;j<=number;j++){
            if(number%j==0){
                digits[index]=j;
                index++;
            }
        }
        return digits;
    }
    public static int sum(int[] factors){
    int sum=0;
    for(int i=0;i<factors.length;i++){
        sum+=factors[i];
    }
    return sum;
    }
    public static int product(int[] factors){
    int product=1;
    for(int i=0;i<factors.length;i++){
        product*=factors[i];
    }
    return product;
    }
    public static int factorSqrSum(int[] factors){
    int sum=0;
    double sqr;
    for(int i=0;i<factors.length;i++){
        sqr=Math.pow(factors[i],2);
        sum+=sqr;
    }
    return sum;
    }
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number");
    int number=input.nextInt();
    int[] result=factor(number);
    System.out.println("Factors of "+number+" are ");
    for(int factors:result){
    System.out.println(factors+" ");
    }
    System.out.println("Sum of factors "+sum(result));
    System.out.println("product of factors"+product(result));
    System.out.println("Sum of sqrt of factors"+factorSqrSum(result));
    }
}