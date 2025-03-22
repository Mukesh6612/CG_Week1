import java.util.*;
class sumarray{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double[] array = new double[10];
        int i = 0;
        double sum = 0.0;
        while (true) {
            if(i > 9){
                break;
            }
            double number = ip.nextDouble();
            if(number > 0){
                array[i] = number;   
            }
            else{
                break;
            }
            
            i++; 
        }
        for( i = 0; i < 10; i++) {
            sum += array[i];  
        }
        System.out.println(sum);
    }
}