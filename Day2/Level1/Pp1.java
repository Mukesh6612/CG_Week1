import java.util.*;
public class Pp1{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		String name = "Harry";
		int birthdate = 2000;
		int currentyear = 2024;
		int age = currentyear - birthdate;
		System.out.print(name+"'s age in" + currentyear +" is " + age);
	}
}