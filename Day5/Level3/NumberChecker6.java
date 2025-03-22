import java.util.*;

class NumberChecker6 {
    public static int[] factors(int number) {
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    
    public static int GreatestFactor(int[] factors) {
        int greatestFactor = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatestFactor) {
                greatestFactor = factor;
            }
        }
        return greatestFactor;
    }
    
    public static int Sum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    
    public static int product(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    
    public static int cubeFactorProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    
    public static boolean isPerfect(int number, int[] factors) {
        return number > 0 && Sum(factors) == number;
    }
    
    public static boolean isAbundant(int number, int[] factors) {
        return Sum(factors) > number;
    }
    
    public static boolean isDeficient(int number, int[] factors) {
        return Sum(factors) < number;
    }
    
    public static boolean StrongNumber(int number) {
        int num = number;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            num /= 10;
        }
        return sum == number;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        input.close();
        
        int[] factors = factors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        
        System.out.println("Greatest Factor: " + GreatestFactor(factors));
        System.out.println("Sum of factors: " + Sum(factors));
        System.out.println("Product of factors: " + product(factors));
        System.out.println("Product of cube of factors: " + cubeFactorProduct(factors));
        System.out.println("Is Perfect Number: " + isPerfect(number, factors));
        System.out.println("Is Abundant Number: " + isAbundant(number, factors));
        System.out.println("Is Deficient Number: " + isDeficient(number, factors));
        System.out.println("Is Strong Number: " + StrongNumber(number));
    }
}
