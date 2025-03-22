import java.util.*;
class naturalnumber{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int sumofnaturalnumbers;
		System.out.println( "If the number is a positive integer then the output is ");
		int number = ip.nextInt();
		if (number >= 0){
			sumofnaturalnumbers = (number * (number+1))/2;
			System.out.println("The sum of"+ number+" natural numbers is "+ sumofnaturalnumbers);
		}
		else{
			System.out.println("The number "+number+" is not a natural number");
		}
	}
}