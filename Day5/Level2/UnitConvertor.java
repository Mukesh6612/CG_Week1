import java.util.*;
class UnitConvertor{
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km*km2miles;
    }
    public static double convertmileToKm(double miles){
        double miles2km = 1.60934;
        return miles*miles2km;
    }
    public static double convertmeterToFeet(double meters){
        double meters2feet = 3.28084;
        return meters*meters2feet;
    }
    public static double convertFeetToMeter(double feet){
        double feet2meters = 0.3048;
        return feet*feet2meters;
    }
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the kilometers");
    double km=input.nextDouble();
    System.out.printf("The %.2f km is %.3f miles\n",km,convertKmToMiles(km));
    System.out.println("Enter the miles");
    double miles=input.nextDouble();
    System.out.printf("The %.3f miles is %.2f km \n",miles,convertmileToKm(miles));
    System.out.println("Enter the meter");
    double meter=input.nextDouble();
    System.out.printf("The %.3f meter is %.2f feet \n",meter,convertmeterToFeet(meter));
    System.out.println("Enter the feet");
    double feet=input.nextDouble();
    System.out.printf("The %.2f feet is %.3f meters\n",feet,convertFeetToMeter(feet));
    }
}
