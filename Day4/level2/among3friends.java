import java.util.*;
class among3friends{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar","Akbar","Anthony"};
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter ages:");
            ages[i] = ip.nextInt();
            System.out.println("Enter heights:");
            heights[i] = ip.nextDouble();
        }
        int smallestage = ages[0];
        String  youngest = names[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < smallestage){
                smallestage = ages[i];
                youngest = names[i];            
            }
        }
        double maxheight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxheight){
                maxheight =heights[i];
                tallest = names[i];
            }
        }
        System.out.println("The youngest friend is: "+ youngest+"(Age: "+smallestage+ ")");
        System.out.println("The tallest friend is: " + tallest + " (Height: " + maxheight + " cm)");
    }
}