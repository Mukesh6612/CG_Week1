import java.util.Scanner;
class salarybonus{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int salary = ip.nextInt();
        int year = ip.nextInt();
        int bonus = 0;
        if(year > 5){
            bonus = (salary/100)*5;
        }
        System.out.println("Bonus salary is "+ bonus);
    }

}