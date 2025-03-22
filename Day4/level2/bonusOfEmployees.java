import java.util.Scanner;

class bonusOfEmployees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numEmployees = 10;
        double[] salary = new double[numEmployees];
        int[] yearOfService = new int[numEmployees];
        double[] newSalary = new double[numEmployees];
        double[] bonus = new double[numEmployees];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for (int i = 0; i < numEmployees; i++) {
            while (true) {
                System.out.println("Enter the present salary and years of experience of employee " + (i + 1) + ":");
                if (input.hasNextDouble()) {
                    salary[i] = input.nextDouble();
                    if (salary[i] <= 0) {
                        System.out.println("Invalid salary. Enter a positive number.");
                        continue;
                    }
                } else {
                    System.out.println("Invalid input. Enter a valid salary.");
                    input.next(); // Consume invalid input
                    continue;
                }

                if (input.hasNextInt()) {
                    yearOfService[i] = input.nextInt();
                    if (yearOfService[i] < 0) {
                        System.out.println("Invalid experience. Enter a non-negative number.");
                        continue;
                    }
                } else {
                    System.out.println("Invalid input. Enter a valid number of years.");
                    input.next();
                    continue;
                }
                break;
            }
        }
        for (int i = 0; i < numEmployees; i++) {
            if (yearOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\nSummary:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] + ", Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        }
        
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
