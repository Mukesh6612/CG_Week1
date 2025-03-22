import java.util.*;
class FarhenheitToCelsius{
    public static double convertFarhenheitToCelsius(double farhenheit){
        double farhenheit2celsius = (farhenheit - 32) * 5/9;
        return farhenheit2celsius;
    }
    public static double convertCelsiusToFarhenheit(double celsius){
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }
    public static double convertPoundsToKg(double pounds){
        double pounds2kilograms = 0.453592;
        return pounds2kilograms*pounds;
    }
    public static double convertkilogramsTopounds(double kg){
        double kilograms2pounds = 2.20462;
        return kg*kilograms2pounds;
    }
    public static double convertgallons2liters(double gallons){
        double gallons2liters = 3.78541;
        return gallons*gallons2liters;
    }
    public static double convertiters2gallons(double liters){
        double liters2gallons = 0.264172;
        return liters*liters2gallons;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the farhenheit");
        double farhenheit=input.nextDouble();
        System.out.printf("The given %.3f in Celsius is %.3f\n",farhenheit,convertFarhenheitToCelsius(farhenheit));
        System.out.println("Enter the celsius");
        double celsius=input.nextDouble();
        System.out.printf("The given %.3f in farenhiet is %.3f\n",celsius,convertCelsiusToFarhenheit(celsius));
        System.out.println("Enter the pounds");
        double pounds=input.nextDouble();
        System.out.printf("The given %.3f in kg is %.3f\n",pounds,convertPoundsToKg(pounds));
        System.out.println("Enter the Kilograms");
        double kg=input.nextDouble();
        System.out.printf("The given %.3f in pounds is %.3f\n",kg,convertkilogramsTopounds(kg));
        System.out.println("Enter the gallons");
        double gallons=input.nextDouble();
        System.out.printf("The given %.3f in liters is %.3f\n",gallons,convertgallons2liters(gallons));
        System.out.println("Enter the liters");
        double liters=input.nextDouble();
        System.out.printf("The given %.3f in gallons is %.3f\n",liters,convertiters2gallons(liters));
    }
}
