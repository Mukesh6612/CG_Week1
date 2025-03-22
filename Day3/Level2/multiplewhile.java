import java.util.*;
class multiplewhile{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();
        int counter = number - 1;
        if(number > 0 && number <100){
            while(counter > 1){
                if(counter%number==0){
                    System.out.println(counter);
                }
                counter--;
            }
        }

    }
}