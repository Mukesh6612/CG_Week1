import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = input.nextInt();
        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.printf("Enter the weight (kg) of person %d: ", (i + 1));
            weight[i] = input.nextDouble();
            System.out.printf("Enter the height (cm) of person %d: ", (i + 1));
            height[i] = input.nextDouble();
            height[i] /= 100;
            bmi[i] = weight[i] / (height[i] * height[i]);
            status[i] = getWeightStatus(bmi[i]);
        }
        System.out.println("\n--- BMI Results ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d -> Height: %.2f meters, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                    (i + 1), height[i], weight[i], bmi[i], status[i]);
        }
    }
    public static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
