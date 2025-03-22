import java.util.*;
class greatesfactorswhile{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int greatestfactor=1;
        int counter =number-1;
        while(counter>1){
            if(number%counter==0){
                greatestfactor=counter;
                break;
            }
        counter--;
        }
        System.out.print(greatestfactor);
    }
}
