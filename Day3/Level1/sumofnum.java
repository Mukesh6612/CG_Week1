import java.util.*;
class sumofnum{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		double n = ip.nextDouble();
		double sum = 0.0;
		while (n >=1){
			
			sum = sum + n;
			n = ip.nextDouble();
		}
		System.out.println(sum);
	}
}
