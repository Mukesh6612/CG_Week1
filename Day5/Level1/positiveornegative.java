import java.util.*;
class positiveornegative{
    public static String checknumber(int number){
        if(number > 0){
            return " The number is Positive";
        }
        else if(number == 0){
            return "The number is Zero";
        }
        else{
            return "The number is negative";
        }
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();
        String result = checknumber(number);
        System.out.println(result); 

    }
}