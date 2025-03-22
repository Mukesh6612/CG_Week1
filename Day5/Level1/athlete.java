
import java.util.Scanner;

class athlete{
    public static int distance(int side1,int side2,int side3){
        int distance = 5;
        int perimeter = side1 + side2+side3;
        int noofrounds =  distance/perimeter;
        return noofrounds;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int side1 = ip.nextInt();
        int side2 = ip.nextInt();
        int side3 = ip.nextInt();
        int result = distance(side1, side2, side3);
        System.out.println("Total rounds: "+result); 
    }
}