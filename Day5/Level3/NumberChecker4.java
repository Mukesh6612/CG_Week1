import java.util.*;

class NumberChecker4 {
    public static int count(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] toStoreArray(int number, int cnt) {
        int[] arr = new int[cnt];
        for (int i = cnt - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reverseArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr[arr.length - 1 - i] = arr[i];
        }
        return reverseArr;
    }

    public static boolean Compare(int[] arr, int[] rev) {
        if (arr.length != rev.length) {
            return false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != rev[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean palindrome(int number) {
        int num = number;
        int res = 0;
        while (num > 0) {
            res = res * 10 + (num % 10);
            num /= 10;
        }
        return res == number;
    }

    public static boolean duckNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        
        int cnt = count(number);
        int[] StoreArr = toStoreArray(number, cnt);
        int[] reverseArr = reverseArray(StoreArr);
        
        System.out.print("Original Array: ");
        for (int num : StoreArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("Reversed Array: ");
        for (int num : reverseArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        boolean compare = Compare(StoreArr, reverseArr);
        System.out.println("Arrays are equal: " + compare);
        
        boolean palindrome = palindrome(number);
        System.out.println("Is Palindrome: " + palindrome);
        
        boolean duckNumber = duckNumber(StoreArr);
        System.out.println("Is Duck Number: " + duckNumber);
        
        input.close();
    }
}
