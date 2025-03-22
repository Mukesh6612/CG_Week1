import java.util.*;
class checksmallestnumber{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int number1 = ip.nextInt();
		int number2 = ip.nextInt();
		int number3 = ip.nextInt();
		System.out.print("Is the first number the smallest?" +((number1<number2)&&(number1<number3)));
	}
}
		
		