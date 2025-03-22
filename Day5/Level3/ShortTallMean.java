import java.util.*;
class ShortTallMean{
    public static double[] randomHeights(int size){
        double[] height=new double[size];
        for(int i=0;i<size;i++){
            height[i]=(Math.random()*(250-150+1))+150;
        }
        return height;
    }
    public static double SumHeight(double[] height){
        double sum=0;
        for(int i=0;i<height.length;i++){
            sum+=height[i];
        }
        return sum;
    }
    public static double meanHeight(double sum,int size){
        return (double)(sum/size) ;
    }
    public static double ShortHeight(double[] height){
        double shorter=Double.MAX_VALUE;
        for(int i=0;i<height.length;i++){
            if(height[i]<shorter){
                shorter=height[i];
            }
        }
        return shorter;
    }
    public static double TAllHeight(double[] height){
        double tall=Double.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            if(height[i]>tall){
                tall=height[i];
            }
        }
        return tall;
    }
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the size of players");
    int size=input.nextInt();
    double[] heights=randomHeights(size);
    double sum=SumHeight(heights);
    double mean=meanHeight(sum,size);
    double shorter=ShortHeight(heights);
    double longer=TAllHeight(heights);
    System.out.println("Mean height is "+mean);
    System.out.println(" Short height is "+shorter);
    System.out.println("Longer height is "+longer);
    }
}
