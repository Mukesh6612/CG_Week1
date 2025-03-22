import java.util.*;
class positiveornegativeorzero{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int number = ip.nextInt();
		if (number > 0){
			System.out.println("Positive");
		}
		else if(number == 0){
			System.out.print("Zero");
		}
		else{
			System.out.print("negative");
		}
	}
}