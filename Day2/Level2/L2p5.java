import java.util.*;
public class L2p5{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int fahrenheit = ip.nextInt();
		int celsiusresult = (fahrenheit - 32) * 5/9;
		System.out.print("The " + fahrenheit +" fahrenheit is "+celsiusresult+" celsius");
	}
}