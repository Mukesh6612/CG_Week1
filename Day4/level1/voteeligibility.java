import java.util.*;
class voteeligiblity{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter num:");
        int size = ip.nextInt();
        int[] ages = new int[size];
        for (int i = 0; i < size; i++) {
            ages[i] = ip.nextInt();   
        }
        for(int i = 0; i < ages.length; i++){
            if (ages[i] > 18){
                System.out.println("The student with age "+ages[i]+" can vote");
            }
            else{
                System.out.println("The student with age"+ages[i]+"cannot vote");
            }
        }
    }
}