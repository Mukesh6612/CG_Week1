import java.util.*;
class trignometric{
    public double[] calculateTrigonometricFunctions(double angle){
         double radians = Math.toRadians(angle); // Convert degrees to radians
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        return new double[]{sinValue, cosValue, tanValue};
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double angle = ip.nextDouble();
        trignometric myobj = new trignometric();
        double[] results = myobj.calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }

}