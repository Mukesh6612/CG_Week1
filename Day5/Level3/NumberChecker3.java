import java.util.*;

class NumberChecker3 {
    public static int count(int number) {
        int count = 0;
        int num = number;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int[] arr(int number, int cnt) {
        int[] arr = new int[cnt];
        for (int i = cnt - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        return arr;
    }

    public static int Sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int SumSquare(int[] arr) {
        int sumSquare = 0;
        for (int num : arr) {
            sumSquare += Math.pow(num, 2);
        }
        return sumSquare;
    }

    public static boolean HarshadNumber(int number) {
        int sum = 0;
        int num = number;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return number % sum == 0;
    }

    public static int[][] freqCount(int[] arr) {
        int visited = -1;
        int cnt = arr.length;
        int[] digits = new int[cnt];
        int[] visitedArr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            int freq = 1;
            for (int j = i + 1; j < cnt; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    arr[j] = visited;
                }
            }
            if (arr[i] != visited) {
                digits[i] = arr[i];
                visitedArr[i] = freq;
            }
        }

        int count = 0;
        for (int i = 0; i < cnt; i++) {
            if (visitedArr[i] != 0) {
                count++;
            }
        }

        int[] finalDigits = new int[count];
        int[] finalFrequencies = new int[count];
        int index = 0;

        for (int i = 0; i < cnt; i++) {
            if (visitedArr[i] != 0) {
                finalDigits[index] = digits[i];
                finalFrequencies[index] = visitedArr[i];
                index++;
            }
        }
        return new int[][] { finalDigits, finalFrequencies };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        
        int cnt = count(number);
        System.out.println("Total digits: " + cnt);
        
        int[] array = arr(number, cnt);
        System.out.print("Digits: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int sum = Sum(array);
        System.out.println("Sum = " + sum);
        
        int squareSum = SumSquare(array);
        System.out.println("Sum of Squares = " + squareSum);
        
        boolean harshad = HarshadNumber(number);
        System.out.println("Is Harshad Number: " + harshad);
        
        int[][] freq = freqCount(array);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq[0].length; i++) {
            System.out.println(freq[0][i] + " - " + freq[1][i]);
        }
        
        input.close();
    }
}
