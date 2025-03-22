import java.util.*;
class checklargesttnumber{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int number1 = ip.nextInt();
		int number2 = ip.nextInt();
		int number3 = ip.nextInt();
		System.out.println("Is the first number the largest?" +((number1>number2)&&(number1>number3)));
		System.out.println("Is the Second number the largest?" +((number2>number1)&&(number2>number3)));
		System.out.print("Is the third number the largest?" +((number3>number2)&&(number3>number1)));
	}
}
		
		