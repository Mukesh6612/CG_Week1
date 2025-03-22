import java.util.*;
class L1p1{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int number = ip.nextInt();
		System.out.print("Is the number " +number+" divisible by 5?" + (number%5==0));
	}
}