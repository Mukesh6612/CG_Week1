import java.util.*;
class multiplesfor{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        if(number>0 && number<100){
            for(int i=number-1;i>0;i--){
                if(number%i==0){
                    System.out.println(i);
                }
            }
        }
    }
}
