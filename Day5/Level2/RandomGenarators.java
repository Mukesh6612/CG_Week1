import java.util.*;
class RandomGenarators{
    public int[] generate4DigitRandomArray(int size){
        int[] random=new int[size];
        for(int i=0;i<size;i++){
            random[i]=(int)(Math.random()*9000)+1000;
        }
        return random;
    }
    public double[] findAverageMinMax(int[] numbers) {
        double average;
        double sum=0;
        double min=Double.MAX_VALUE;
        double max=Double.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            if(numbers[i]>max){
                max=numbers[i];
            }
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        average=sum/numbers.length;
        return new double[]{average,min,max};
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter how many random numbers should be generate");
        int size=input.nextInt();
        RandomGenarators res=new RandomGenarators();
        int[] result=res.generate4DigitRandomArray(size);
        double[] fina=res.findAverageMinMax(result);
        for(int i=0;i<size;i++){
            System.out.println(result[i]);
        }
        System.out.println("Average of 5 random numbers is "+fina[0]);
        System.out.println("Minimum value of 5 random numbers is "+fina[1]);
        System.out.println("Maximum value of 5 random numbers is "+fina[2]);
    }
}
