import java.util.*;
public class L2p1{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int number1 = ip.nextInt();
		int number2 = ip.nextInt();
		System.out.print("The Quotient is " + (number1/number2)+
		" and Reminder is "+(number1%number2)+ " of two number " 
		+ number1+" and "+ number2);
	}
}