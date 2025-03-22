import java.util.*;
public class L2p2{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int a = ip.nextInt();
		int b = ip.nextInt();
		int c = ip.nextInt();
		System.out.print("The results of Int Operations are "+ (a + b * c)+"," + (a * b + c)+","+ (c + a / b)+" and " + (a % b + c));
	}
}






/*Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are —-, -—, and —-*/