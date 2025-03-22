
import java.util.Scanner;

class sumofnaturalnum{
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		int temp = num;
		int sum = 0;
		while (num >= 1){
			sum += num;
			num--;
		}
		System.out.println(sum);
		int natural = (temp*(temp+1))/2;
		System.out.println(natural);
		if (sum == natural){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}