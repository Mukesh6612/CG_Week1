import java.util.*;
class Temperature{
    public double calculateWindChill(double temperature, double windSpeed){
        double wildchill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
        return wildchill;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double temperature = ip.nextDouble();
        double windSpeed = ip.nextDouble();
        Temperature myobj = new Temperature();
        double result = myobj.calculateWindChill(temperature,windSpeed);
        System.out.print(result); 
    }
}