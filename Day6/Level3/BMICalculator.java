import java.util.Scanner;

public class BMICalculator {
   public static double calculateBMI(double weight, double height) {
       height = height / 100; // Convert height to meters
       return Math.round((weight / (height * height)) * 100.0) / 100.0;
   }

   public static String determineStatus(double bmi) {
       if (bmi <= 18.4) return "Underweight";
       else if (bmi <= 24.9) return "Normal";
       else if (bmi <= 39.9) return "Overweight";
       else return "Obese";
   }

   public static String[][] computeBMI(double[][] persons) {
       String[][] results = new String[persons.length][4];
       for (int i = 0; i < persons.length; i++) {
           double weight = persons[i][0];
           double height = persons[i][1];
           double bmi = calculateBMI(weight, height);
           String status = determineStatus(bmi);
           results[i][0] = String.valueOf(weight);
           results[i][1] = String.valueOf(height);
           results[i][2] = String.valueOf(bmi);
           results[i][3] = status;
       }
       return results;
   }

   public static void displayResults(String[][] results) {
       System.out.println("Weight (kg)\tHeight (cm)\tBMI\tStatus");
       for (String[] result : results) {
           System.out.println(result[0] + "\t\t" + result[1] + "\t\t" + result[2] + "\t" + result[3]);
       }
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double[][] persons = new double[10][2];
      
       for (int i = 0; i < 10; i++) {
           System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
           persons[i][0] = scanner.nextDouble();
           System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
           persons[i][1] = scanner.nextDouble();
       }
       scanner.close();
      
       String[][] results = computeBMI(persons);
       displayResults(results);
   }
}
