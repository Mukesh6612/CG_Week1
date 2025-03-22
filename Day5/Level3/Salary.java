import java.util.*;

class Salary {
    public static int[][] salaryYearOfService(int n) {
        int[][] employeeDetails = new int[n][2];
        for (int i = 0; i < n; i++) {
            employeeDetails[i][0] = (int) (Math.random() * 100000);
            employeeDetails[i][1] = (int) (Math.random() * 10);
        }
        return employeeDetails;
    }

    public static double[][] bonusNewSalary(int[][] employeeDetails) {
        double[][] newSalary = new double[employeeDetails.length][3];
        
        for (int i = 0; i < employeeDetails.length; i++) {
            if (employeeDetails[i][1] >= 5) {
                newSalary[i][0] = employeeDetails[i][0] * 0.05; // Bonus
            } else {
                newSalary[i][0] = employeeDetails[i][0] * 0.02; // Bonus
            }

            newSalary[i][1] = employeeDetails[i][0]; // Old Salary
            newSalary[i][2] = newSalary[i][1] + newSalary[i][0]; // New Salary
        }
        return newSalary;
    }

    public static void displaySalary(int[][] employeeDetails, double[][] newSalary) {
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < employeeDetails.length; i++) {
            totalBonus += newSalary[i][0];
            totalOldSalary += newSalary[i][1];
            totalNewSalary += newSalary[i][2];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = input.nextInt();

        int[][] employeeDetails = salaryYearOfService(n);
        double[][] newSalary = bonusNewSalary(employeeDetails);
        displaySalary(employeeDetails, newSalary);
    }
}
