
import java.util.Scanner;

class employeebonus{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double totaloldsalary = 0,totalbonus = 0, totalnewsalary = 0;
        double[][] array = new double[10][2];
        double[][] array1 = new double[10][2];
        for (int i = 0; i < 10; i++) {
            while (true) { 
                double salary = ip.nextDouble();
                double yearsofservice = ip.nextDouble();
                if (salary < 0 || yearsofservice <0){
                    System.out.println("print Valid input");
                    continue;
                }
                array[i][0] = salary;
                array[i][1] = yearsofservice;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            double salary = array[i][0];
            double years = array[i][1];
            double bonus;

            if(years > 5){
                bonus = salary *0.05;
            }
            else{
                bonus = salary * 0.02;
            }
            double newsalary = salary + bonus;
            array1[i][0] = bonus;
            array1[i][1] = newsalary;

            totaloldsalary += salary;
            totalbonus += bonus;
            totalnewsalary += newsalary;
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.1f\t\t\t%.2f\t\t%.2f\n", (i+1),array[i][0],array[i][1],array1[i][0],array1[i][1]);

        }
        System.out.println("\nTotal Old Salary: $" + totaloldsalary);
        System.out.println("Total Bonus Payout: $" + totalbonus);
        System.out.println("Total New Salary: $" + totalnewsalary);
    }
}