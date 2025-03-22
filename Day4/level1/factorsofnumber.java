import java.util.Scanner;
class factorsofnumber{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();
        int maxfactor = 10;
        int index = 0;
        int[] factors = new int[maxfactor];
        for (int i = 1; i < number; i++) {
            if(number%i==0){
                if (index==maxfactor){
                    maxfactor = maxfactor*2;
                    int[] temp = new int[maxfactor];
                    for(int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index] = i;
                index++;
            } 
        }
        System.out.println("Factors of "+ number+" are: ");
        for(int i =0;i < index; i++){
            System.out.print(factors[i] + " ");
        }   
    }
}
