
import java.util.Scanner;

class simpleinterest{
    public static int Simple(int principle,int rate,int time){
        int si = (principle*rate*time)/100;
        return si;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int principle = ip.nextInt();
        int rate = ip.nextInt();
        int time =  ip.nextInt();
        int result=Simple(principle, rate, time);
        System.out.print(result);

    }
}