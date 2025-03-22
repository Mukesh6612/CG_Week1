import java.util.*;
class leapYear{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int year=input.nextInt();
    if(year>=1582){
        if(year%4==0 && year%100!=0){
            System.out.println(year+" is a Leap year");
        }
        else if(year%400==0){
            System.out.println(year+" is a Leap year");
        }
        else{
            System.out.println("Not leap year");
        }
    }
    else{
        System.out.println("Enter the year above 1582");
    }
    }
}
