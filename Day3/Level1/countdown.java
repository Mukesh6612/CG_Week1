import java.util.*;
class countdown{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int count = ip.nextInt();
		while (count > 1){;
			count = count - 1;
			System.out.println(count);
		}
	}
}