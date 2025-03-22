import java.util.*;
class calculator{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double first=input.nextDouble();
    double second=input.nextDouble();
    System.out.print("Enter the operation in +,-,/,*");
    input.nextLine();
    String op=input.nextLine();
    switch(op) {
    case "+" -> System.out.println(first+second);
    case "-" -> System.out.println(second-first);
    case "*" -> System.out.println(first*second);
    case "/" -> System.out.println(second/first);
    default -> System.out.println("Invalid Operator");
    }
    }
}