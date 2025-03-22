import java.util.*;
class multidimensionalarray{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int rows = ip.nextInt();
        int col = ip.nextInt();
        int size = 0;
        int[][] arr = new int[rows][col];
        int[] array = new int[rows*col];
        System.out.println("Enter the elements of th 2D Array:");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < col ; j++) {
                arr[i][j] = ip.nextInt();
            }
        for ( i = 0; i < rows; i++){
            for (int j = 0; j < col; j++) {
                
                array[size] = arr[i][j];
                size++; 
            }
        }
        for (i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
        }
    }
}