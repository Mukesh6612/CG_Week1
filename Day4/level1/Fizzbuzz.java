import java.util.Scanner;
class Fizzbuzz{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();
        String[] array = new String[number];
        if(number > 0){
            for(int i = 1; i < number; i++){
                if(i%3==0 && i%5==0){
                    array[i] = "FizzBuzz";
                }
                else if(i%3==0){
                    array[i] = "Fizz";
                }
                else if(i%5==0){
                    array[i] = "Buzz";
                }
                else{
                    array[i] = String.valueOf(i);
                }
            }
        }
        else{
            System.out.println("Enter positive integer");
        }
        for (int i = 1; i < number; i++) {
            System.out.println("postion "+i+":"+array[i]);
        }
    }
}