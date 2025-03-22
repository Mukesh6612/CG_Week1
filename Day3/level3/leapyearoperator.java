import java.util.*;
class LeapYear2{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the year");
    int year=input.nextInt();
    if(year>=1582 && (year%4==0 && year%100!=0 || year%400==0)){
        System.out.println(year +" is a Leap Year");
    }
    else{
        System.out.print("Not a Leap year");
    }
    }
}
