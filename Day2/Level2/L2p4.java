import java.util.*;
public class L2p4{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int celsius = ip.nextInt();
		int farenheitresult = (celsius * 9/5) +32;
		System.out.print("The " + celsius +" celsius is "+farenheitresult+" fahrenheit");
	}
}