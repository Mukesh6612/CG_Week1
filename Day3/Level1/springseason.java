import java.util.*;
class springseason{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int month = ip.nextInt();
		int day = ip.nextInt();
		if ((month == 3 && day >= 20) ||
            (month > 3 && month < 6) ||
            (month == 6 && day <= 20)){
			System.out.println("It's a Spring Season");
		}else{
			System.out.print("Not a spring season");
		}
	}
}
