import java.util.*;
class factors{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=input.nextInt();
        if(number > 0){
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("Enter positive number");
        }    
    }
}
