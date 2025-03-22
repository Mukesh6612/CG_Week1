import java.util.*;
class Quadratic{
    public static double[] roots(double a,double b,double c){
        double delta=Math.pow(b,2)-(4*a*c);
        if(delta>0){
            double root1=(-b+Math.sqrt(delta))/(2*a);
            double root2=(-b-Math.sqrt(delta))/(2*a);
            return new double[]{root1,root2};
        }
        if(delta==0){
            double root=-b/(2*a);
            return new double[]{root};
        }
        else{
            return new double[0];
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the values of a,b,c");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double[] Roots=roots(a, b, c);
        switch (Roots.length) {
            case 0:
                System.out.println("No roots are there");
                break;
            case 1:
                System.out.printf("The roots of a,b,c in qudratic equation are %.3f",Roots[0]);
                break;
            default:
                System.out.printf("The roots of a,b,c in qudratic equation are %.3f",Roots[0],Roots[1]);
                break;
        }
    }
}
