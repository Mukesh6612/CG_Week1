import java.util.*;
public class L2p3{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		double a = ip.nextDouble();
		double b = ip.nextDouble();
		double c = ip.nextDouble();
		System.out.printf("The results of double Operations are %.2f,%.2f,%.2f and %.2f ",
		(a + b * c),(a * b + c),(c + a / b),(a % b + c));
	}
}