import java.util.*;
class footballteam{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int mean;
        int sum = 0;
        int i = 0;
        int size = ip.nextInt();
        double[] heights = new double[11];
        for (i = 0; i < 10; i++) {
            heights[i] = ip.nextDouble();
        }
        for ( i = 0; i < size; i++) {
            sum += heights[i];
        }
        mean = sum/size;
        System.out.println(mean);

    }
}