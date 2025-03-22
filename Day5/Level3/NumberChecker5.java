import java.util.*;

class NumberChecker5 {
    public static boolean CheckPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean NeonNumber(int number) {
        int num = (int) Math.pow(number, 2);
        int res = num;
        int sum = 0;
        while (res > 0) {
            sum += res % 10;
            res /= 10;
        }
        return sum == number;
    }

    public static boolean SpyNumber(int number) {
        int num = number;
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    public static boolean autoMorphic(int number) {
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf((long) number * number);
        return squareStr.endsWith(numStr);
    }

    public static boolean buzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        
        boolean isPrime = CheckPrime(number);
        System.out.println("Is Prime: " + isPrime);
        
        boolean isNeon = NeonNumber(number);
        System.out.println("Is Neon Number: " + isNeon);
        
        boolean isSpy = SpyNumber(number);
        System.out.println("Is Spy Number: " + isSpy);
        
        boolean isAutoMorphic = autoMorphic(number);
        System.out.println("Is AutoMorphic: " + isAutoMorphic);
        
        boolean isBuzz = buzzNumber(number);
        System.out.println("Is Buzz Number: " + isBuzz);
        
        input.close();
    }
}
