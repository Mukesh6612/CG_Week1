import java.util.*;
class LeapYear{
    public static boolean Leap(int year){
        if(year<1582){
            System.out.println("Enter year above 1582");
            return false;
        }
        else return (year%4==0 && year%100!=0) || (year%400==0);
    }
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the year ");
    int year=input.nextInt();
    if(Leap(year)){
    System.out.println(year+" is a leap year");
    }
    else{
    System.out.println(year+" is not a leap year");
    }
    }
}
